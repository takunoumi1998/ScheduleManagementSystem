<script type="text/javascript" th:inline="javascript">
/*<![CDATA[*/
	var date = new Date();
	var monthLastDay = new Date(date.getFullYear(),date.getMonth()+1,0);
	var DAY_OF_MONTH = monthLastDay.getDate();

	alert(DAY_OF_MONTH);

	var scheduleDiv = document.getElementById('schedule');
	var table = document.createElement('table');

	for(var i = 0; i < 10; i++){
		var tr = document.create Element('tr');
		for(var j = 1; j <= DAY_OF_MONTH; j++){
			var td = document.createElement('td');
			tr.appendChild(td);
		}
	}

	scheduleDiv.appendChild(table);
/*]]>*/
</script>