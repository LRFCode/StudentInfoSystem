var labels = document.getElementById("grade-distribution-data").getAttribute("data-labels").split(",");
   var data = document.getElementById("grade-distribution-data").getAttribute("data-data").split(",");

   var ctx = document.getElementById("grade-distribution-chart");
   var myChart = new Chart(ctx, {
       type: 'bar',
       data: {
         labels: labels,
         datasets: [
           {
             label: "Number of Students",
             data: data,
             backgroundColor: ["#3e95cd", "#8e5ea2", "#ffce56", "#3cba9f", "#c45850"]
           }
         ]
       },
       options: {
         legend: { display: false },
         title: {
           display: false,
           text: 'Average Overall by Letter Grade'
         }
       }
   });