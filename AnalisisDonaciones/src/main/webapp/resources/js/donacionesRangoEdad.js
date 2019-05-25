$(document).ready(function(){
  //alert('uso 2');
  $('#tablaRango').DataTable({
	            "language": {
			     "url": "//cdn.datatables.net/plug-ins/1.10.15/i18n/Spanish.json"
			                },
			     "columns": [
			                    { data: 'Orden', visible: false },
			                    { data: 'Rango Edad' },
			                    { data: 'Aceptadas', class: 'text-center' },
			                    { data: 'Rechazadas', class: 'text-center' },
			                    { data: 'Total', class: 'text-center' },			                   
			                ],
			     //"searching": false,
			     "paging":   false,
			     //"ordering": false,
			     "info":     false,			    
			    "pagingType": "first_last_numbers",
			    "order": [[ 0, "asc" ]]
 });
});



google.charts.load("current", {packages:["corechart"]});
google.charts.setOnLoadCallback(drawChart);
 
function drawChart() {  
	  
  var arreglo =  []; 
  var arreglo1 = []; 
  var arreglo2 = [];   
 
  var arreglo7 = []; 
  var arreglo8 = [];   
  var arreglo9 = []; 
  
  var arregloDonaciones =[];
  var arregloFila1  =[];
  var arregloFila2  =[];
	 
  $('#tablaRango tr').each(function(index, element){
    if (index > 0 )
	 {				
        clave = $(element).find("td").eq(0).text() ;
        
        valor1 = $(element).find("td").eq(1).text();	
        valor2 = $(element).find("td").eq(2).text();
        valorDonacion = $(element).find("td").eq(3).text();
        	        
		arreglo[index-1]=  [ clave ];
		
		arreglo1[index-1]=  [ valor1];
		arreglo2[index-1]=  [ valor2];
		
		arregloDonaciones[index-1]=  [ valorDonacion];
	
		
	 };	
  }); 
 
  var data5 = new google.visualization.DataTable();
  data5.addColumn('string', 'Rango');
  data5.addColumn('number', 'Valor');

  for(i = 0; i < arreglo.length; i++){	
    data5.addRow([ String( arreglo[i ] ), parseInt(arregloDonaciones[i ])]);
  }

  var options5 =
  {
    title: 'Grafico de donaciones por Rango de Edad',
    is3D : true, 
    pieSliceText: 'label',
    tooltip :  {showColorCode: true},
    pieHole: 0.4,   
    'width' : 500, 
    'height' :450 
         
  };
 
  new google.visualization.PieChart(document.getElementById('graficoDonaciones5')).
  draw(data5, options5); 
   
	   
  var data = new google.visualization.DataTable();
  data.addColumn('string', 'Rango');
  data.addColumn('number', 'Aceptado');
  data.addColumn('number', 'Rechazado'); 
 

  for(i = 0; i < arreglo.length; i++){	
    data.addRow([ String(arreglo[i ]) , parseInt(arreglo1[i ]), parseInt(arreglo2[i ])]);
  }
     
  var options = {
          title : 'Grafico de Donaciones Por Rango de Edad',
          vAxis: {title: 'Cantidad Donaciones'},
          hAxis: {title: 'Rango'},
          seriesType: 'bars',         
          'width' : 220, 
          'height' :220
        };

  var chart = new google.visualization.ComboChart(document.getElementById('graficoCantRed'));//graficoCantRedModal
  chart.draw(data, options);
  
  var options2 =
  {
	 title : 'Grafico de Donaciones Por Rango de Edad',
     vAxis: {title: 'Cantidad Donaciones'},
     hAxis: {title: 'Rango'},
     seriesType: 'bars',    
     'width' : 920,
     'height' :600
         
  };

 var chart2 =  new google.visualization.ComboChart(document.getElementById('graficoCantRedModal'));
 chart2.draw(data, options2);
 
 
 
 /***************************************/
 var sumaTotal = 0;
 var sumaFila = 0;
 $('#tablaRango tr').each(function(index2, element1){
	    if (index2 > 0 )
		 {				
	        valor10 = $(element1).find("td").eq(3).text() ;	       	      
	        sumaTotal = sumaTotal + parseInt(valor10);	      		
						
		 };	
	  }); 
 
 $('#tablaRango tr').each(function(index1, element1){
	    if (index1 > 0 )
		 {				
	        clave1 = $(element1).find("td").eq(0).text() ;
	        
	        valor7 = $(element1).find("td").eq(1).text();	
	        valor8 = $(element1).find("td").eq(2).text();	
	        
	        sumaFila = parseInt(valor7)+ parseInt(valor8);
	      
			arreglo7[index1-1]=  [ clave1 ];
			
			arreglo8[index1-1] =   ( [ valor7] * 100)/sumaTotal;
			arreglo9[index1-1] =   ( [ valor8] * 100)/sumaTotal;
			
			arregloFila1[index1-1] =   ( [ valor7] * 100)/sumaFila;
			arregloFila2[index1-1] =   ( [ valor8] * 100)/sumaFila;
						
		 };	
 }); 

 /*****************************************/
 var datafila = new google.visualization.DataTable();
 datafila.addColumn('string', 'Rango');
 datafila.addColumn('number', 'Aceptado');
 datafila.addColumn('number', 'Rechazado');
 

 for(i = 0; i < arreglo7.length; i++){	
	 datafila.addRow([String( arreglo7[i ] ) , arregloFila1[i ], arregloFila2[i ]]);
 }
 
 var optionsfila =
 {
	title : 'Grafico de Donaciones Por Rango de Edad (Porcentajes) 100% = aceptado + rechazado por rango',
    vAxis: {title: 'Porcentaje Donaciones'},
    hAxis: {title: 'Rango'},
    seriesType: 'bars',
    'width' : 220 , 
	 'height' :220 
        
 };
 
 var chartfila = new google.visualization.ComboChart(document.getElementById('graficoCantRangoPorcentajeChicoFila'));
 chartfila.draw(datafila, optionsfila);
 
 
 var optionsfilaGrande =
 {
	title : 'Grafico de Donaciones Por Rango de Edad (Porcentajes)',
	vAxis: {title: 'Porcentaje Donaciones'},
	hAxis: {title: 'Rango'},
	seriesType: 'bars',
    'width' : 920, 
    'height' :600
        
 };
 
 var chartfilaGrande = new google.visualization.ComboChart(document.getElementById('graficoCantRangoPorcentajeFilaGrande'));
 chartfilaGrande.draw(datafila, optionsfilaGrande);

 /******************************/
 var data1 = new google.visualization.DataTable();
 data1.addColumn('string', 'Rango');
 data1.addColumn('number', 'Aceptado');
 data1.addColumn('number', 'Rechazado');
 

 for(i = 0; i < arreglo7.length; i++){	
   data1.addRow([String( arreglo7[i ] ) , arreglo8[i ], arreglo9[i ]]);
 }
 
 var options3 =
 {
	title : 'Grafico de Donaciones Por Rango de Edad (Porcentajes)',
    vAxis: {title: 'Porcentaje Donaciones'},
    hAxis: {title: 'Rango'},
    seriesType: 'bars',
    'width' : 220 , 
	 'height' :220  
        
 };
 
 var chart3 = new google.visualization.ComboChart(document.getElementById('graficoCantRangoPorcentajeChico'));
 chart3.draw(data1, options3);
 
 
 var options4 =
 {
	title : 'Grafico de Donaciones Por Rango de Edad (Porcentajes) - 100% suma de todos los rangos',
	vAxis: {title: 'Porcentaje Donaciones'},
	hAxis: {title: 'Rango'},
	seriesType: 'bars',
    'width' : 920,
    'height' :600
        
 };

var chart4 =  new google.visualization.ComboChart(document.getElementById('graficoCantRedModalPorcentaje'));
chart4.draw(data1, options4);  
  
$('#grafico1').hide();
$('#grafico2').hide();
$('#grafico3').hide();
}

$('.openBtn').on('click',function(){  
	  
        $('#grafico1').show();
        $('.cerrarGrafico1Btn').focus(); 
      
});

$('.cerrarGrafico1Btn').on('click',function(){ 
	    $("#grafico1").fadeOut("slow");
      
});

$('.openBtn2').on('click',function(){ 
	  
        $('#grafico2').show();
        $('.cerrarGrafico2Btn').focus();  
});

$('.cerrarGrafico2Btn').on('click',function(){ 
	    $("#grafico2").fadeOut("slow");
       
});

$('.openBtn3').on('click',function(){ 
   
    $('#grafico3').show();
    $('.cerrarGrafico2Btn3').focus();  
});

$('.cerrarGrafico2Btn3').on('click',function(){ 
    $("#grafico3").fadeOut("slow");
   
});




