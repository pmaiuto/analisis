$(document).ready(function(){
  //alert('uso 6');
  $('#example').DataTable({
	            "language": {
			     "url": "//cdn.datatables.net/plug-ins/1.10.15/i18n/Spanish.json"
			                },
			    "columnDefs": [
			        {"className": "dt-center", "targets": "_all"}
			      ],
			     //"searching": false,
			     //"paging":   false,
			     //"ordering": false,
			     //"info":     false
			    "order": [[ 2, "asc" ]]
			    //"pagingType": "first_last_numbers"
 });
  
  $('#tablaCompleta').DataTable({
      "language": {
	     "url": "//cdn.datatables.net/plug-ins/1.10.15/i18n/Spanish.json"
	                },
	    "columnDefs": [
	        {"className": "dt-center", "targets": "_all"}
	      ],
	    
	     "paging":   false,	   
	     "info":     false,
	    "order": [[ 0, "asc" ]]
	  
}); 
  
  $('#tablaSecundaria').hide();  
});



google.charts.load("current", {packages:["corechart"]});
google.charts.setOnLoadCallback(drawChart);
 
function drawChart() {  
	  
  var arreglo =  []; 
  var arreglo1 = []; 
  var arreglo2 = []; 
  var arreglo2 = []; 
  var arreglo3 = []; 
  var arreglo4 = [];   
  var arreglo5 = []; 
  var arreglo6 = []; 
  
  var arreglo14 =  []; 
  var arreglo7 = []; 
  var arreglo8 = []; 
  var arreglo9 = []; 
  var arreglo3 = []; 
  var arreglo10 = [];   
  var arreglo11 = []; 
  var arreglo12 = []; 
  
  var arregloDonaciones =[];
	 
  $('#tablaCompleta tr').each(function(index, element){
    if (index > 0 )
	 {				
        clave = $(element).find("td").eq(0).text() ;
        
        valor1 = $(element).find("td").eq(1).text();	
        valor2 = $(element).find("td").eq(2).text();	
        valor3 = $(element).find("td").eq(3).text();	
        valor4 = $(element).find("td").eq(4).text();	
        valor5 = $(element).find("td").eq(5).text();	
        valor6 = $(element).find("td").eq(6).text();	
        
        valorDonacion = $(element).find("td").eq(7).text();
        
		arreglo[index-1]=  [ clave ];
		
		arreglo1[index-1]=  [ valor1];
		arreglo2[index-1]=  [ valor2];
		arreglo3[index-1]=  [ valor3];
		arreglo4[index-1]=  [ valor4];
		arreglo5[index-1]=  [ valor5];
		arreglo6[index-1]=  [ valor6];
		
		arregloDonaciones[index-1]=  [ valorDonacion];
		
	 };	
  }); 
  
  
  var data5 = new google.visualization.DataTable();
  data5.addColumn('string', 'Año');
  data5.addColumn('number', 'Valor');

  for(i = 0; i < arreglo.length; i++){	
    data5.addRow([ String( arreglo[i ] ), parseInt(arregloDonaciones[i ])]);
  }

  var options5 =
  {
    title: 'Grafico de donaciones',
    is3D : true, 
    pieSliceText: 'label',
    tooltip :  {showColorCode: true},
    pieHole: 0.4,   
    'width' : 300, 
    'height' :200 
         
  };
 
  new google.visualization.PieChart(document.getElementById('graficoDonaciones')).
  draw(data5, options5); 
 
    
  var data = new google.visualization.DataTable();
  data.addColumn('string', 'Fecha');
  data.addColumn('number', 'Habitual Acepado');
  data.addColumn('number', 'Habitual Rechazado');
  data.addColumn('number', 'No Hab Aceptado');
  data.addColumn('number', 'No Hab Rechazado');
  data.addColumn('number', 'Pri vez Aceptado');
  data.addColumn('number', 'Pri vez Rechazado');

  for(i = 0; i < arreglo.length; i++){	
    data.addRow([ String( arreglo[i ]), parseInt(arreglo1[i ]), parseInt(arreglo2[i ]), parseInt(arreglo3[i ]), parseInt(arreglo4[i ]), parseInt(arreglo5[i ]), parseInt(arreglo6[i ])]);
  }
     
  var options = {
          title : 'Grafico de donaciones',
          vAxis: {title: 'Cantidad Donaciones'},
          hAxis: {title: 'Fecha'},
          seriesType: 'bars',
          'width' : 270, 
          'height' :220
        };

  var chart = new google.visualization.ComboChart(document.getElementById('donutchart'));
  chart.draw(data, options);
    
  var options2 =
  {
	 title : 'Grafico de donaciones',
     vAxis: {title: 'Cantidad Donaciones'},
     hAxis: {title: 'Fecha'},
     seriesType: 'bars',
     'width' : 920, 
     'height' :600
         
  };

 var chart2 =  new google.visualization.ComboChart(document.getElementById('graficoModal'));
 chart2.draw(data, options2); 
 
 
 /***************************************/
 $('#tablaCompleta tr').each(function(index1, element1){
	    if (index1 > 0 )
		 {				
	        clave1 = $(element1).find("td").eq(0).text() ;
	        
	        valor7 = $(element1).find("td").eq(1).text();	
	        valor8 = $(element1).find("td").eq(2).text();	
	        valor9 = $(element1).find("td").eq(3).text();	
	        valor10 = $(element1).find("td").eq(4).text();	
	        valor11 = $(element1).find("td").eq(5).text();	
	        valor12 = $(element1).find("td").eq(6).text();	
	        valorSuma = $(element1).find("td").eq(7).text();	        
	      
	        suma = parseInt(valorSuma);
	       
			arreglo14[index1-1]=  [ clave1 ];
			
			arreglo7[index1-1] =   ( [ valor7] * 100)/suma;
			arreglo8[index1-1] =   ( [ valor8] * 100)/suma;
			arreglo9[index1-1] =   ( [ valor9] * 100)/suma;
			arreglo10[index1-1] =  ( [ valor10] * 100)/suma;
			arreglo11[index1-1] =  ( [ valor11] * 100)/suma;
			arreglo12[index1-1] =  ( [ valor12] * 100)/suma;
			
		 };	
	  }); 
 
 var data1 = new google.visualization.DataTable();
 data1.addColumn('string', 'Fecha');
 data1.addColumn('number', 'Habitual Aceptado');
 data1.addColumn('number', 'Habitual Rechazado');
 data1.addColumn('number', 'No Hab Aceptado');
 data1.addColumn('number', 'No Hab Rechazado');
 data1.addColumn('number', 'Pri vez Aceptado');
 data1.addColumn('number', 'Pri vez Rechazado');

 for(i = 0; i < arreglo14.length; i++){	
   data1.addRow([ String( arreglo14[i ] ), arreglo7[i ], arreglo8[i ], arreglo9[i ], arreglo10[i ], arreglo11[i ], arreglo12[i ]]);
 }
 
 var options3 =
 {
	 title : 'Grafico de donaciones (Porcentaje)',
    vAxis: {title: 'Porcentaje Donaciones'},
    hAxis: {title: 'Fecha'},
    seriesType: 'bars',
    'width' : 220 , 
	 'height' :270 
        
 };
 
 var chart3 = new google.visualization.ComboChart(document.getElementById('donutchart3'));
 chart3.draw(data1, options3);
 
 var options4 =
 {
	 title : 'Grafico de donaciones (Porcentaje)',
    vAxis: {title: 'Porcentaje Donaciones'},
    hAxis: {title: 'Fecha'},
    seriesType: 'bars',
    'width' : 920,
    'height' :600
        
 };

var chart4 =  new google.visualization.ComboChart(document.getElementById('graficoPorcentaje'));
chart4.draw(data1, options4); 

$('#grafico1').hide();
$('#grafico2').hide();
 
}

$('.openBtn').on('click',function(){
	
    $('#grafico1').show();
    $('.cerrarGrafico1Btn').focus();
  
});

$('.openBtn2').on('click',function(){
	
	 $('#grafico2').show();
	 $('.cerrarGrafico2Btn').focus();
});

$('.cerrarGrafico1Btn').on('click',function(){  
	    $("#grafico1").fadeOut("slow");
       
});

$('.cerrarGrafico2Btn').on('click',function(){
	    $("#grafico2").fadeOut("slow");
       
 
});

$('.openTab').on('click',function(){
   
        $('#tablaSecundaria').show();
        $('.openTab').hide();        
  
});

$('.closeTab').on('click',function(){
 
        $('#tablaSecundaria').hide();
        $('.openTab').show();
        
   
});