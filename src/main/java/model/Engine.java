package model;

public class Engine {
	private String engineName;
	private int engineVolume;

	public Engine(String engineName, int engineVolume) {
		this.engineName = engineName;
		this.engineVolume = engineVolume;
	}

	public Engine() {
	}

	public String getEngineName() {
		return this.engineName;
	}

	public int getEngineVolume() {
		return this.engineVolume;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}

	public void setEngineVolume(int engineVolume) {
		this.engineVolume = engineVolume;
	}

	public String toString() {
		return "Engine(engineName=" + this.getEngineName() + ", engineVolume=" + this
			.getEngineVolume() + ")";
	}
}
