
package top.xmxin.logtools;

public abstract class LogAbstract {
	private double baseNum, trueNum;
	
	public LogAbstract(double baseNum, double trueNum) {
		this.setBaseNum(baseNum);
		this.setTrueNum(trueNum);
	}
	
	public abstract double Log(double baseNum, double trueNum);
	
	public double getTrueNum() {
		return trueNum;
	}
	public void setTrueNum(double trueNum) {
		this.trueNum = trueNum;
	}
	public double getBaseNum() {
		return baseNum;
	}
	public void setBaseNum(double baseNum) {
		this.baseNum = baseNum;
	}
	public double LogCount() {
		return Math.log10(trueNum) / Math.log10(baseNum);
	}
}
