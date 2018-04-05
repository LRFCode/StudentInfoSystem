var data = document.getElementById("scSubData").getAttribute("data-courseNames").split(",");
var data = document.getElementById("scSubData").getAttribute("data-teacherNames").split(",");
var data = document.getElementById("scSubData").getAttribute("data-GPA").split(",");

var $table = $('#coursetable');

$(function () {
  buildTable($table, 8, 1);
});

function expandTable($detail, cells) {
  buildTable($detail.html('<table></table>').find('table'), cells, 1);
}

function buildTable($el, cells, rows) {
  var i, j, row,
      columns = [],
      data = data;

  for (i = 0; i < cells; i++) {
    columns.push({
      field: 'field' + i,
      title: 'Cell' + i,
      sortable: true
    });
  }
  for (i = 0; i < rows; i++) {
    row = {};
    for (j = 0; j < cells; j++) {
      row['field' + j] = 'Row-' + i + '-' + j;
    }
    data.push(row);
  }
  $el.bootstrapTable({
    columns: [Course Name, Teacher Name, Course Grade]  //TODO FINISH DATA
    data: [data-courseNames,],
    detailView: cells > 1,
    onExpandRow: function (index, row, $detail) {
      expandTable($detail, cells - 1);
    }
  });
}