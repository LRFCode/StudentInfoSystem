var labels = document.getElementById("adv-safety-data").getAttribute("data-labels").split(",");
var data = document.getElementById("adv-safety-data").getAttribute("data-data").split(",");

<!-- javascript init -->
chartColor = "#FFFFFF";

// General configuration for the charts with Line gradientStroke

ctx = document.getElementById('adv-safety-chart').getContext("2d");

gradientStroke = ctx.createLinearGradient(500, 0, 100, 0);
gradientStroke.addColorStop(0, '#80b6f4');
gradientStroke.addColorStop(1, chartColor);

gradientFill = ctx.createLinearGradient(0, 200, 0, 50);
gradientFill.addColorStop(0, "rgba(128, 182, 244, 0)");
gradientFill.addColorStop(1, "rgba(255, 255, 255, 0.24)");

myChart = new Chart(ctx, {
    type: 'line',
    data: {
        labels: labels,
        datasets: [{
            label: "Assignment Grades",
            borderColor: "#FFFFFF",
            pointBorderColor: "#FFFFFF",
            pointBackgroundColor: "#1e3d60",
            pointHoverBackgroundColor: "#1e3d60",
            pointHoverBorderColor: "#FFFFFF",
            pointBorderWidth: 1,
            pointHoverRadius: 7,
            pointHoverBorderWidth: 2,
            pointRadius: 5,
            fill: true,
            backgroundColor: gradientFill,
            borderWidth: 2,
            data: data
        }]
    },
     options: {
                  layout: {
                      padding: {
                          left: 20,
                          right: 20,
                          top: 0,
                          bottom: 0
                      }
                  },
                  maintainAspectRatio: false,
                  tooltips: {
                    backgroundColor: '#fff',
                    titleFontColor: '#333',
                    bodyFontColor: '#666',
                    bodySpacing: 4,
                    xPadding: 12,
                    mode: "nearest",
                    intersect: 0,
                    position: "nearest"
                  },
                  legend: {
                      position: "bottom",
                      fillStyle: "#FFF",
                      display: false
                  },
                  scales: {
                      yAxes: [{
                          ticks: {
                              fontColor: "rgba(255,255,255,0.4)",
                              fontStyle: "bold",
                              beginAtZero: true,
                              maxTicksLimit: 5,
                              padding: 10
                          },
                          gridLines: {
                              drawTicks: true,
                              drawBorder: false,
                              display: true,
                              color: "rgba(255,255,255,0.1)",
                              zeroLineColor: "transparent"
                          }

                      }],
                      xAxes: [{
                          gridLines: {
                              zeroLineColor: "transparent",
                              display: false,

                          },
                          ticks: {
                              padding: 10,
                              fontColor: "rgba(255,255,255,0.4)",
                              fontStyle: "bold"
                          }
                      }]
                  }
              }
          });

/*

export default Line.extend({
  data () {
    return {
      gradient: null,
      gradient2: null
    }
  },
  mounted () {
    this.gradient = this.$refs.canvas.getContext('2d').createLinearGradient(0, 0, 0, 450)
    this.gradient2 = this.$refs.canvas.getContext('2d').createLinearGradient(0, 0, 0, 450)

    this.gradient.addColorStop(0, 'rgba(255, 0,0, 0.5)')
    this.gradient.addColorStop(0.5, 'rgba(255, 0, 0, 0.25)');
    this.gradient.addColorStop(1, 'rgba(255, 0, 0, 0)');

    this.gradient2.addColorStop(0, 'rgba(0, 231, 255, 0.9)')
    this.gradient2.addColorStop(0.5, 'rgba(0, 231, 255, 0.25)');
    this.gradient2.addColorStop(1, 'rgba(0, 231, 255, 0)');


    this.renderChart({
      labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July'],
      datasets: [
        {
          label: 'Data One',
          borderColor: '#FC2525',
          pointBackgroundColor: 'white',
          borderWidth: 1,
          pointBorderColor: 'white',
          backgroundColor: this.gradient,
          data: [40, 39, 10, 40, 39, 80, 40]
        },{
          label: 'Data Two',
          borderColor: '#05CBE1',
          pointBackgroundColor: 'white',
          pointBorderColor: 'white',
          borderWidth: 1,
          backgroundColor: this.gradient2,
          data: [60, 55, 32, 10, 2, 12, 53]
        }
      ]
    }, {responsive: true, maintainAspectRatio: false})

  }
})

*/
