package com.crawler;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
	public static void main(String[] args) throws IOException {
		String linkDoc = "http://trollbongda.com";
		Document doc = Jsoup.connect(linkDoc + "/?start=40").get();
		Elements es = doc.getElementsByClass("catItemTitle");
		for (Element e :es) {
			Element tagA = e.getElementsByTag("a").first();
			String link = tagA.attr("href");
			System.out.println(linkDoc+link);
		}
	}
}
