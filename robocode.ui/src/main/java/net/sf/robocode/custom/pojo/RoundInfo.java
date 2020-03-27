package net.sf.robocode.custom.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * 一轮战斗的集合
 * @Title: RoundInfo.java
 * @Description: <功能详细描述>
 * @author  Leo Zhang
 * @date 2020年3月26日下午6:08:28
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class RoundInfo {
	/** 0,个人，1代表机器 **/
	private int type;
	private String roundName;
	List<BattleInfo> battleInfos = new ArrayList<BattleInfo>();

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public RoundInfo() {
	}

	public String getRoundName() {
		return roundName;
	}

	public void setRoundName(String roundName) {
		this.roundName = roundName;
	}

	public List<BattleInfo> getBattleInfos() {
		return battleInfos;
	}

	public void setBattleInfos(List<BattleInfo> battleInfos) {
		this.battleInfos = battleInfos;
	}

}
