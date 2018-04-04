var labels = document.getElementById("grade-distribution-data").getAttribute("data-labels").split(",");
   var data = document.getElementById("grade-distribution-data").getAttribute("data-data").split(",");

   var ctx = document.getElementById("grade-distribution-chart");
   var myChart = new Chart(ctx, {
       responsive: true,
       type: 'bar',
       data: {
         labels: labels,
         datasets: [
           {
             label: "Number of Students",
             data: data,
             backgroundColor: ["#F2385A", "#F5A503", "#E9F1DF", "#4AD9D9", "#36B1BF"]
           }
         ]
       },
       options: {
         legend: { display: false },
         ticks: { beginAtZero:true },
         title: {
           display: false,
           text: 'Average Overall by Letter Grade'
         }
       }
   });

      var ctx = document.getElementById("grade-distribution-chart1");
      var myChart = new Chart(ctx, {
          responsive: true,
          type: 'bar',
          data: {
            labels: labels,
            datasets: [
              {
                label: "Number of Students",
                data: data,
                backgroundColor: ["#F2385A", "#F5A503", "#E9F1DF", "#4AD9D9", "#36B1BF"]
              }
            ]
          },
          options: {
            legend: { display: false },
            ticks: { beginAtZero:true },
            title: {
              display: false,
              text: 'Average Overall by Letter Grade'
            }
          }
      });

       });
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
