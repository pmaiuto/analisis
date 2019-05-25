<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
 <div class="col-sm-10">
      	
   <!-- column 2 -->	
   <h3><i class="fa fa-hospital-o"></i> Banco Sangre</h3>             
   <hr>
      
   <div class="row">
      <!-- center left-->	
      <div class="col-md-9">
		 <div class="well"><h4>Donaciones.  Periodo 2015 - 2018</h4></div>               
         
              
           <div class="panel panel-default">

              <div class="panel-body">                    				
				  <br/>										
					
					 <div class="row">
					 
						 <div class="row">							
					
						     <div class="col-md-9">
			                                				
							     <div id="graficoDonaciones5" class="  wow rotateIn"   style="width:500px; height: 450px; animation-duration: 2s;"  data-wow-duration="2s"> </div>								
							
							 </div> 
						</div> 							
				
				      <div class="col-md-12">
			
				       <table id="tablaRango" class="display" style="width:100%">
						    <thead>
						      <tr>	
						        <th>Orden</th>					        
						        <th>Rango Edad</th>
						        <th>Aceptadas</th>
						        <th>Rechazadas</th>	
						        <th>Total</th>							    			        					       
						      </tr>
						    </thead>
						    <tbody>						
						        <c:forEach items="${listaDonacionRangoEdad}" var="u1">						        
						      <tr>		
						        <td><c:out value="${u1.getOrden()}"/></td>						      
						        <td><c:out value="${u1.getRango()}"/></td>						      
						        <td><c:out value="${u1.getAceptadas()}"/></td>
						        <td><c:out value="${u1.getRechazadas()}"/></td>
						        <td><c:out value="${u1.getTotal()}"/></td>
						      </tr>						      
						      </c:forEach>						      
						    </tbody>
					    </table>  					 
			                   
					  </div><!-- class="col-md-4" -->		
						
					</div>
					
            
            </div><!--/panel-body-->
           </div><!--/panel-->                     
              
       </div><!--/col-->
         
       <!--center-right-->
       <div class="col-md-3">                                 
		
		<div class="panel panel-default">
		   <div id="graficoCantRed" style="width:220px; height: 220px; "> </div> 			
        </div> 
        	
		<!-- Trigger the modal with a button -->
		<button type="button" class="btn btn-primary btn-icon openBtn " ><i class="fa fa-search-plus" aria-hidden="true"></i>&nbsp;&nbsp;Ampliar <i class="fa fa-bar-chart" aria-hidden="true"></i></button>
		
		<div>&nbsp;</div>
		
		 <div class="panel panel-default">
		  <div id="graficoCantRangoPorcentajeChico" style="width:220px; height: 220px; "> </div> 			
         </div> 	
        
		<!-- Trigger the modal with a button -->
		<button type="button" class="btn btn-primary btn-icon openBtn2 " ><i class="fa fa-search-plus" aria-hidden="true"></i>&nbsp;&nbsp;Ampliar <i class="fa fa-bar-chart" aria-hidden="true"></i></button>
		
		<div>&nbsp;</div>	
				
		 <div class="panel panel-default">
		  <div id="graficoCantRangoPorcentajeChicoFila" style="width:220px; height: 220px; "> </div> 			
         </div> 	
        
		<!-- Trigger the modal with a button -->
		<button type="button" class="btn btn-primary btn-icon openBtn3 " ><i class="fa fa-search-plus" aria-hidden="true"></i>&nbsp;&nbsp;Ampliar <i class="fa fa-bar-chart" aria-hidden="true"></i></button>
	
		

              
	</div> 
     
   </div><!--/row-->
   
   
     <!-- Nueva fila para los graficos-    -->
   
  
	  
	  	
				    
	<div class="row">						
				
		 <div class="col-md-12">  
			   
				<div id="grafico1"  >								 
					<div class="panel panel-default">
						  <div id="graficoCantRedModal"  class="wow rotateIn"   style="animation-duration: 2s;"  data-wow-duration="2s" > </div>                 
			              <p  style=" margin: 10px 190px 10px 30px; text-align:justify;font-weight: 500; font-style: Verdana; ">
							Los donantes con edad desde los 18 a los 40 años son los que mas concurren a realizar donaciones    	  
					      </p>
			              <!-- Trigger the modal with a button -->
					      <button type="button" class="btn btn-primary btn-icon cerrarGrafico1Btn " ><i class="fa fa-search-plus" aria-hidden="true"></i>&nbsp;&nbsp;Cerrar <i class="fa fa-bar-chart" aria-hidden="true"></i></button>
							
			       	 </div>
				</div> 
				  
				<div id="grafico2" >									 
				    <div class="panel panel-default">	 
			        	  <div id="graficoCantRedModalPorcentaje"  class="wow rotateIn"   style="animation-duration: 2s;"  data-wow-duration="2s" > </div>                       
			              <p  style=" margin: 10px 190px 10px 30px; text-align:justify;font-weight: 500; font-style: Verdana; ">
						   Porcentajes de donaciones por rango de edad. La suma de todos los rangos, suma de aceptados mas rechazados corresponden al 100% de las donaciones      	  
					      </p>
			              <!-- Trigger the modal with a button -->
					      <button type="button" class="btn btn-primary btn-icon cerrarGrafico2Btn " ><i class="fa fa-search-plus" aria-hidden="true"></i>&nbsp;&nbsp;Cerrar <i class="fa fa-bar-chart" aria-hidden="true"></i></button>
			        	     
					</div>
				</div>  
				
				<div id="grafico3" >									 
				    <div class="panel panel-default">	 
			        	  <div id="graficoCantRangoPorcentajeFilaGrande"  class="wow rotateIn"   style="animation-duration: 2s;"  data-wow-duration="2s" > </div>                       
			              <p  style=" margin: 10px 190px 10px 30px; text-align:justify;font-weight: 500; font-style: Verdana; ">
							Cuanto mas edad tienen los donantes podemos observar que el porcentaje de donaciones aceptadas aumenta y disminuye el porcentaje de donaciones rechazadas.      	  
					      </p>
			              <!-- Trigger the modal with a button -->
					      <button type="button" class="btn btn-primary btn-icon cerrarGrafico2Btn3 " ><i class="fa fa-search-plus" aria-hidden="true"></i>&nbsp;&nbsp;Cerrar <i class="fa fa-bar-chart" aria-hidden="true"></i></button>
			        	     
					</div>
				</div>    	  
	   </div>							
				
  </div>
   
</div><!--/col-span-9-->
  
  	
  	