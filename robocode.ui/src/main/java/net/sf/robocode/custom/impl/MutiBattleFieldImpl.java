package net.sf.robocode.custom.impl;

import net.sf.robocode.custom.api.BattleFieldApi;

public class MutiBattleFieldImpl extends AbstractBattleFieldImpl {

	@Override
	public void pullNextRound() {
		this.choseApiByProperty().pullNextRound();
	}

	private BattleFieldApi choseApiByProperty() {
		return new StaticBattleFieldImpl();
	}

}
