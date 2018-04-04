var labels = document.getElementById("zero-distribution-data").getAttribute("data-labels").split(",");
var data = document.getElementById("zero-distribution-data").getAttribute("data-data").split(",");

var ctx = document.getElementById("zero-distribution-chart");
   var myChart = new Chart(ctx, {
    responsive: true,
    type: 'pie',
    data: {
      labels: labels,
      datasets: [{
        label: "# of Zeroes per Student",
        data: data,
        backgroundColor: ["#0D397F", "#F4F9E9", "#1C77C8", "#FF1A6A", "#BC0639"]
      }]
    },
    options: {
      ticks: { beginAtZero:true },
      title: {
        display: false,
        text: 'Predicted world population (millions) in 2050'
      }
    }
});