<script>
$(function(){
    $('#class').editable({
        value: 2,
        source: [
              {value: 1, text: 'Freshmen'},
              {value: 2, text: 'Sophomore'},
              {value: 3, text: 'Junior'}
              {value: 4, text: 'Senior'}
           ]
    });
});
</script>