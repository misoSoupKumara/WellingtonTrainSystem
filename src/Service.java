import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service {

	private Line trainLine;
	private String trainID; // train line name + starting time of the train
	private List<Integer> times = new ArrayList<Integer>();

	// Make a new TrainService on a particular train line
	public Service(Line trainLine) {
		this.trainLine = trainLine;
	}

	public Line getTrainLine() {
		return trainLine;
	}

	public void setTrainLine(Line trainLine) {
		this.trainLine = trainLine;
	}

	public String getTrainID() {
		return trainID;
	}

	public void setTrainID(String trainID) {
		this.trainID = trainID;
	}

	public List<Integer> getTimes() {
		// unmodifiable version of the list of times
		return Collections.unmodifiableList(times);
	}

	public void setTimes(List<Integer> times) {
		this.times = times;
	}

	/**
	 * Add the next time to the TrainService
	 */
	public void addTime(int time, boolean firstStop) {
		times.add(time);
		if (trainID == null && time != -1) {
			if (firstStop) {
				trainID = trainLine.getName() + "-" + time;
			} else {
				time += 10000;
				trainID = trainLine.getName() + "-" + time;
			}
		}
	}

	/**
	 * Return the start time of this Train Service -1 if no start times
	 */
	public int getStart() {
		for (int time : times) {
			if (time != -1) {
				return time;
			}
		}
		return -1;
	}

	/**
	 * ID plus number of stops
	 */
	public String toString() {
		if (trainID == null) {
			return trainLine.getName() + "-unknownStart";
		}
		int count = 0;
		for (int time : times) {
			if (time != -1)
				count++;
		}
		return trainID + " (" + count + " stops)" + "\n";
	}

}
