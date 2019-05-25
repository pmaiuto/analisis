$(document).ready(function(){
  //alert('uso 2');
  $('#example').DataTable({
	            "language": {
			     "url": "//cdn.datatables.net/plug-ins/1.10.15/i18n/Spanish.json"
			                },
			    "columnDefs": [
			        {"className": "dt-center", "targets": "_all"}
			      ],
			     
			     "paging":   false,			  
			     "info":     false,			    
			    "pagingType": "first_last_numbers",
			    "order": [[ 2, "desc" ]]
 });
});

google.charts.load("current", {packages:["corechart"]});
google.charts.setOnLoadCallback(drawChart);
 
function drawChart() {  
	  
  var arreglo = []; 
  var arreglo1 = []; 
	 
  $('#example tr').each(function(index, element){
    if (index > 0 )
	 {				
        clave = $(element).find("td").eq(0).text() + $(element).find("td").eq(1).text();
        valor = $(element).find("td").eq(2).text();			
		arreglo[index-1]=  [ clave ];
		arreglo1[index-1]=  [ valor];
		
	 };	
  }); 
	   
  var data = new google.visualization.DataTable();
  data.addColumn('string', 'Abo');
  data.addColumn('number', 'Valor');

  for(i = 0; i < arreglo.length; i++){	
    data.addRow([ String( arreglo[i ] ), parseInt(arreglo1[i ])]);
  }

  var options =
  {
    title: 'Grafico de ABO',
    is3D : true,   
    tooltip :  {showColorCode: true},
    pieHole: 0.4,   
    'width' : 220,
    'height' :270 
         
  };
 
  new google.visualization.PieChart(document.getElementById('donutchart')).
   draw(data, options); 
    
  var options2 =
  {
     title: 'Grafico de ABO',
     is3D : true,     
     tooltip :  {showColorCode: true},
     pieHole: 0.4,  
     'width' : 850 , 
	'height' :550  
         
  };
 
  new google.visualization.PieChart(document.getElementById('donutchartModal')).
    draw(data, options2); 
 
}

$('.openBtn').on('click',function(){
   
        $('#myModal').modal({show:true});
 
});