package br.mil.decex;

import java.io.UnsupportedEncodingException;

import net.beaconhillcott.moodlerest.MoodleCallRestWebService;
import net.beaconhillcott.moodlerest.MoodleCourse;
import net.beaconhillcott.moodlerest.MoodleRestCourse;
import net.beaconhillcott.moodlerest.MoodleRestException;

public class MoodleRestSample {

	public static void main(String[] args) throws UnsupportedEncodingException, MoodleRestException {

		String token = "61f24a9f544af93be194ecdc42839e88";
		String url = "http://localhost/doutrina-moodle";

		MoodleCallRestWebService.init(url, token);
		MoodleCallRestWebService.setDebug(false);
		MoodleCourse[] courses = MoodleRestCourse.getAllCourses();
		for (int i = 0; i < courses.length; i++) {
			System.out.println(courses.toString());
		}
	}
}
