$(document).ready(function(){
  //alert('uso 2');
  $('#example').DataTable({
	            "language": {
			     "url": "//cdn.datatables.net/plug-ins/1.10.15/i18n/Spanish.json"
			                },
			    "columnDefs": [
			        {"className": "dt-center", "targets": "_all"}
			      ],			   
			    "order": [[ 2, "asc" ]]
			   
 });
});