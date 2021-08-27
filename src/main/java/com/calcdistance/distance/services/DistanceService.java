package com.calcdistance.distance.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calcdistance.distance.models.Buisiness;
import com.calcdistance.distance.models.Location;
import com.calcdistance.distance.repositories.BuisinessRepo;

@Service
public class DistanceService {
	@Autowired
	private BuisinessRepo br;
	public List<Buisiness> getBusinesses(Location l)
	{
		List<Buisiness> allBuisiness=br.findAll();
		List<Buisiness> ans=new ArrayList<Buisiness>();
		for(Buisiness b:allBuisiness)
		{
			if(distance(b.getLatitude(),b.getLongitude(),l.getLatitude(),l.getLongitude(),'k')<=l.getDist())
			{
				ans.add(b);
			}
		}
		return ans;
	}
	private double distance(double lat1, double lon1, double lat2, double lon2, char unit) {
		  double theta = lon1 - lon2;
		  double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
		  dist = Math.acos(dist);
		  dist = rad2deg(dist);
		  dist = dist * 60 * 1.1515;
		  if (unit == 'k') {
		    dist = dist * 1.609344;
		    System.out.println(dist);
		  } else if (unit == 'n') {
		  dist = dist * 0.8684;
		    }
		  return (dist);
		}
		private double deg2rad(double deg) {
		  return (deg * Math.PI / 180.0);
		}

		private double rad2deg(double rad) {
		  return (rad * 180.0 / Math.PI);
		}
}
