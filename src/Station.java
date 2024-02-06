import java.util.ArrayList;
import java.util.List;

public class Station {

	private String stationName;
	private int fareZone;
	private double distanceFromHub;
	// The set of TrainLines that go through that station.
	private List<Line> lines = new ArrayList<Line>();

	public Station(String stationName, int fareZone, double distanceFromHub) {
		super();
		this.stationName = stationName;
		this.fareZone = fareZone;
		this.distanceFromHub = distanceFromHub;
		this.lines = new ArrayList<>();
	}

	// add lines to stations
	public void addlines(Line l) {
		this.lines.add(l);
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public int getFareZone() {
		return fareZone;
	}

	public void setFareZone(int fareZone) {
		this.fareZone = fareZone;
	}

	public double getDistanceFromHub() {
		return distanceFromHub;
	}

	public void setDistanceFromHub(double distanceFromHub) {
		this.distanceFromHub = distanceFromHub;
	}

	@Override
	public String toString() {
		// 如果直接不需要列出Line的具体名字
//		 return stationName +" (fareZone "+fareZone +", "+lines.size() + " lines)" + "\n";

		StringBuilder lineList = new StringBuilder();

		// 如果是 first line，那么就没有,
		boolean firstLine = true;

		for (Line l : lines) {
			if (!firstLine) {
				lineList.append(", ");
			} else {
				firstLine = false;
			}
			lineList.append(l.getName());
		}

//		return stationName + "(fareZone " + fareZone + ", " + lines.size() + " lines)" + "  LineList： " + lineList.toString() + "\n";
		return stationName + " (zone " + fareZone + ", " + lines.size() + " lines)";
	}

	public List<Line> getLines() {
		// TODO Auto-generated method stub
		return lines;
	}
}
