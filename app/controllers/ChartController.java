package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class ChartController extends Controller
{
    public Result getChart()
    {
        return ok(views.html.chart.render());
    }
}
