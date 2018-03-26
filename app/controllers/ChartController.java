package controllers;

import play.mvc.Controller;
import play.mvc.Result;
//Currently a testing controller...eventually all charts will be run through here
public class ChartController extends Controller
{

    public Result getChart()
    {
        return ok(views.html.chart.render());
    }

    public Result getGraph()
    {
        return ok(views.html.graphs.render());
    }
}
