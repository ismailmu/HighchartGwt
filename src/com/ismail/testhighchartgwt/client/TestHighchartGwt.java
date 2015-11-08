package com.ismail.testhighchartgwt.client;

import org.moxieapps.gwt.highcharts.client.Chart;
import org.moxieapps.gwt.highcharts.client.Series;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TestHighchartGwt implements EntryPoint {

	@Override
	public void onModuleLoad() {
		Chart chart = new Chart();
		Series series = chart.createSeries().setName("Moles per Yard")
				.setPoints(new Number[] { 163, 203, 276, 408, 547, 729, 628 });
		chart.addSeries(series);

		Series series2 = chart.createSeries().setName("Moles per Yard 2 ")
				.setPoints(new Number[] { 11, 22, 123, 408, 233, 214, 333 });
		chart.addSeries(series2);

		chart.setType(Series.Type.SPLINE);
		chart.setChartTitleText("Lawn Tunnels");
		chart.setMarginRight(10);

		RootPanel.get().add(chart);
	}
}
