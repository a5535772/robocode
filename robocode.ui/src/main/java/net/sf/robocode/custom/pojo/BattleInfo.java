package net.sf.robocode.custom.pojo;

/**
 * 
 * 单场战斗的信息
 * @Title: BattleInfo.java
 * @Description: <功能详细描述>
 * @author  Leo Zhang
 * @date 2020年3月26日下午6:07:51
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class BattleInfo {
	private String  battleName;
	private int  numRounds=3;
	private int  sentryBorderSize=100;
	private double gunCoolingRate=0.1d;
	private int FieldWidth=1000;
	private int FieldHeight=800;
	private String selectedRobots;
	private long inactivityTime=450;
	private  boolean hideEnemyNames=false;
	public BattleInfo() {
	}
	
	
	public BattleInfo(String battleName, String selectedRobots) {
		super();
		this.battleName = battleName;
		this.selectedRobots = selectedRobots;
	}


	public String getBattleName() {
		return battleName;
	}
	public void setBattleName(String battleName) {
		this.battleName = battleName;
	}
	public int getNumRounds() {
		return numRounds;
	}
	public void setNumRounds(int numRounds) {
		this.numRounds = numRounds;
	}
	public int getSentryBorderSize() {
		return sentryBorderSize;
	}
	public void setSentryBorderSize(int sentryBorderSize) {
		this.sentryBorderSize = sentryBorderSize;
	}
	public double getGunCoolingRate() {
		return gunCoolingRate;
	}
	public void setGunCoolingRate(double gunCoolingRate) {
		this.gunCoolingRate = gunCoolingRate;
	}
	public int getFieldWidth() {
		return FieldWidth;
	}
	public void setFieldWidth(int fieldWidth) {
		FieldWidth = fieldWidth;
	}
	public String getSelectedRobots() {
		return selectedRobots;
	}
	public void setSelectedRobots(String selectedRobots) {
		this.selectedRobots = selectedRobots;
	}
	public long getInactivityTime() {
		return inactivityTime;
	}
	public void setInactivityTime(long inactivityTime) {
		this.inactivityTime = inactivityTime;
	}
	public boolean isHideEnemyNames() {
		return hideEnemyNames;
	}
	public void setHideEnemyNames(boolean hideEnemyNames) {
		this.hideEnemyNames = hideEnemyNames;
	}
	public int getFieldHeight() {
		return FieldHeight;
	}
	public void setFieldHeight(int fieldHeight) {
		FieldHeight = fieldHeight;
	}
	
}
