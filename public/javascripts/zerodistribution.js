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
        backgroundColor: ["#45B4D9", "#F6B701", "#01C89E", "#FF204B", "#8FD6CC"]
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