package net.sf.robocode.custom.impl;

import static net.sf.robocode.io.Logger.logError;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import net.sf.robocode.battle.BattleProperties;
import net.sf.robocode.custom.api.BattleFieldApi;
import net.sf.robocode.custom.pojo.BattleInfo;
import net.sf.robocode.custom.pojo.RoundInfo;
import net.sf.robocode.io.FileUtil;

public abstract class AbstractBattleFieldImpl implements BattleFieldApi {

	protected void saveRoundInfo(RoundInfo roundInfo) {
		List<BattleInfo> list = roundInfo.getBattleInfos();
		if (isPreCheckPast(list) != Boolean.TRUE) {
			return;
		}
		for (BattleInfo battle : list) {
			saveBattleInfo(battle);
		}

	}

	private void saveBattleInfo(BattleInfo battle) {
		String path = setBattleFilename(battle.getBattleName());
		BattleProperties battleProperties = extractedBattlePropertiesBy(battle);
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(path);
			battleProperties.store(out, "Battle Properties");
		} catch (IOException e) {
			logError("IO Exception saving battle properties: " + e);
		} finally {
			FileUtil.cleanupStream(out);
		}
	}

	private Boolean isPreCheckPast(List<BattleInfo> list) {
		for (BattleInfo battle : list) {
			String path = setBattleFilename(battle.getBattleName());
			if (path == null) {
				logError("Cannot save battle to null path, use setBattleFilename()");
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}

	private BattleProperties extractedBattlePropertiesBy(BattleInfo battle) {
		BattleProperties battleProperties = new BattleProperties();
		battleProperties.setSentryBorderSize(battle.getSentryBorderSize());
		battleProperties.setNumRounds(battle.getNumRounds());
		battleProperties.setBattlefieldWidth(battle.getFieldWidth());
		battleProperties.setBattlefieldHeight(battle.getFieldHeight());
		battleProperties.setGunCoolingRate(battle.getGunCoolingRate());
		battleProperties.setInactivityTime(battle.getInactivityTime());
		battleProperties.setSelectedRobots(battle.getSelectedRobots());
		battleProperties.setHideEnemyNames(battle.isHideEnemyNames());
		return battleProperties;
	}

	public String setBattleFilename(String newBattleFilename) {
		String battleFilename = null;
		if (newBattleFilename != null) {
			battleFilename = newBattleFilename.replace((File.separatorChar == '/') ? '\\' : '/', File.separatorChar);

			if (battleFilename.indexOf(File.separatorChar) < 0) {
				try {
					battleFilename = FileUtil.getBattlesDir().getCanonicalPath() + File.separatorChar + battleFilename;
				} catch (IOException ignore) {
				}
			}
			if (!battleFilename.endsWith(".battle")) {
				battleFilename += ".battle";
			}
		}
		return battleFilename;
	}

}
