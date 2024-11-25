import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ForensicReport {

	private Map<String,Date> reportMap=new HashMap<String,Date>();

	public Map<String, Date> getReportMap() {
		return reportMap;
	}

	public void setReportMap(Map<String, Date> reportMap) {
		this.reportMap = reportMap;
	}

    public void addReportDetails(String reportingOfficer, Date reportFiledDate) {
		this.reportMap.put(reportingOfficer, reportFiledDate);
		
	}

	public List<String> getOfficersWhoFiledReportsOnDate(Date reportFiledDate){
			List<String> OfficersnameList = new ArrayList<String>();
			
//			Date reportFiledDate1 = reportMap.get(OfficersnameList);
			
			for(Map.Entry<String, Date> entry:reportMap.entrySet()) {
				if(entry.getValue().equals(reportFiledDate)) {
					OfficersnameList.add(entry.getKey());
				}
			}
		
		
		return OfficersnameList;
	}
}
