package com.crawler;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Main {
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("http://trollbongda.com/?start=40").get();
		Elements es = doc.getElementsByClass("itemContainer");
		System.out.println(es.size());
	}
}
