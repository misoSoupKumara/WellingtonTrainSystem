import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Line {

	private String lineName;
	private List<Station> stations = new ArrayList<Station>(); // list of stations on the line
	private List<Service> trainServices = new ArrayList<Service>(); // set of TrainServices running on the line

	// add stations into the line
	public void addStation(Station s) {
		this.stations.add(s);
	}

	//add services into the line
	public void addService(Service service) {
		this.trainServices.add(service);
	}

	public Line(String name) {
		super();
		this.lineName = name;
	}

	public String getName() {
		return lineName;
	}

	public void setName(String name) {
		this.lineName = name;
	}

	public List<Station> getStations() {
		return Collections.unmodifiableList(stations); // an unmodifiable version of the list of stations
	}

	public void setStations(List<Station> stations) {
		this.stations = stations;
	}

	public List<Service> getTrainServices() {
		 return Collections.unmodifiableList(trainServices); // an unmodifiable version of the list of trainServices
	}

	public void setTrainServices(List<Service> trainServices) {
		this.trainServices = trainServices;
	}

	@Override
	public String toString() {
	
//		 return lineName + ": " + "\n" + stations.size() + " stations: " + "\n" + stations + "\n" + trainServices.size()+" services:" +"\n" + trainServices;
		 return (lineName+" ("+stations.size()+" stations, "+trainServices.size()+" services)");
	}
	
	

}
