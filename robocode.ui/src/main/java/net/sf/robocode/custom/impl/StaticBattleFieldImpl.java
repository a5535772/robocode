package net.sf.robocode.custom.impl;

import net.sf.robocode.custom.pojo.BattleInfo;
import net.sf.robocode.custom.pojo.RoundInfo;
import net.sf.robocode.custom.util.RoundType;

public class StaticBattleFieldImpl extends AbstractBattleFieldImpl {

	private static final int MAX_BATTLE_INDEX = 2;
	private static final String ROUND_NAME = "Round 1";

	@Override
	public void pullNextRound() {
		this.saveRoundInfo(fetchRoundInfo());
	}

	private RoundInfo fetchRoundInfo() {
		RoundInfo roundInfo = new RoundInfo();
		roundInfo.setRoundName(ROUND_NAME);
		roundInfo.setType(RoundType.Robet.getType());
		for (int i = 1; i <= MAX_BATTLE_INDEX; i++) {
			roundInfo.getBattleInfos().add(fetchBattleInfo(i));
		}
		return roundInfo;
	}

	private BattleInfo fetchBattleInfo(int index) {
		BattleInfo battleInfo = new BattleInfo();
		battleInfo.setBattleName(ROUND_NAME+" Battle"+" "+index);
		if (index == 1) {
			battleInfo.setSelectedRobots("sample.Tracker,sample.SittingDuck");
		}
		if (index == 2) {
			battleInfo.setSelectedRobots("sample.Tracker,sample.Corners");
		}
		return battleInfo;
	}

}
