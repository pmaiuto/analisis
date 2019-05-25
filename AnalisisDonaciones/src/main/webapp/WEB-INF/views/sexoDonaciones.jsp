<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
 <div class="col-sm-10">
      	
   <!-- column 2 -->	
   <h3><i class="fa fa-hospital-o"></i> Banco Sangre</h3>             
   <hr>
      
   <div class="row">
      <!-- center left-->	
      <div class="col-md-9">
		  <div class="well"><h4>Donaciones Por Sexo.  Periodo 2015 - 2018</h4></div>              
         
              
           <div class="panel panel-default">

              <div class="panel-body">                    				
				  									
					 <div id="graficoSexo" class="  wow rotateIn"   style="width:380px; height: 200px; animation-duration: 2s;"  data-wow-duration="2s"> </div>  
					 <div class="row">							
				
				      <div class="col-md-12">
			
				       <table id="tablaCompleta" class="display" style="width:100%">
						    <thead>
						      <tr>						        
						        <th>Sexo</th>
						        <th>HA</th>
						        <th>HR</th>	
						        <th>NA</th>	
						        <th>NR</th>	
						        <th>PA</th>	
						        <th>PR</th>	
						        <th>TOTAL</th>				        					       
						      </tr>
						    </thead>
						    <tbody>						
						        <c:forEach items="${listaSexoDonacionResultado}" var="u1">						        
						      <tr>						      
						        <td><c:out value="${u1.getSexo()}"/></td>
						        <td><c:out value="${u1.getHabitualAceptado()}"/></td>
						        <td><c:out value="${u1.getHabitualRechazado()}"/></td>
						        <td><c:out value="${u1.getNohabitualAceptado()}"/></td>
						        <td><c:out value="${u1.getNoHabitualRechazado()}"/></td>
						        <td><c:out value="${u1.getPrimeraVezAceptado()}"/></td>
						        <td><c:out value="${u1.getPrimeraVezRechazado()}"/></td>	
						        <td><c:out value="${u1.getPrimeraVezRechazado()+u1.getPrimeraVezAceptado()+u1.getNohabitualAceptado()+u1.getNoHabitualRechazado()+u1.getHabitualRechazado()+u1.getHabitualAceptado() }"/></td>					       
						      </tr>						      
						      </c:forEach>						      
						    </tbody>
					    </table>  					 
			                   
					  </div><!-- class="col-md-4" -->		
						
					</div>
					 <div class="row">							
				
				      
					 <div class="col-md-6">			
				     	
				     	<div  style=" margin: 5px"> HA: Donaciones Donante Habitual Aceptadas</div>				     						     	
				     	<div  style=" margin: 5px"> HR: Donaciones Donante Habitual Rechazadas</div>			     				     
				     	<div  style=" margin: 5px "> NA: Donaciones Donante No Habitual Aceptadas</div>			     				     					 
				      		                   
					 </div>	
					 <div class="col-md-6">			
				     	
				     	<div  style=" margin: 5px"> NR: Donaciones Donante No Habitual Rechazadas</div>				     						     	
				     	<div  style=" margin: 5px"> PA: Donaciones Donante Primera Vez Aceptadas</div>			     				     
				     	<div  style=" margin: 5px ">PR: Donaciones Donante Primera Vez Rechazadas</div>			     				     					 
				      		                   
					 </div>	
					</div>
					
					<br>	
					 			
					
				   

            </div><!--/panel-body-->
           </div><!--/panel-->                     
              
       </div><!--/col-->
         
       <!--center-right-->
       <div class="col-md-3">                                 
		
		<div class="panel panel-default">
		   <div id="donutchart" style="width:220px; height: 270px; "> </div> 			
        </div> 
        	
		<!-- Trigger the modal with a button -->
		<button type="button" class="btn btn-primary btn-icon openBtn " ><i class="fa fa-search-plus" aria-hidden="true"></i>&nbsp;&nbsp;Ampliar <i class="fa fa-bar-chart" aria-hidden="true"></i></button>
		
		<div>&nbsp;</div>
		
		 <div class="panel panel-default">
		  <div id="donutchart3" style="width:220px; height: 270px; "> </div> 			
         </div> 	
        
		<!-- Trigger the modal with a button -->
		<button type="button" class="btn btn-primary btn-icon openBtn2 " ><i class="fa fa-search-plus" aria-hidden="true"></i>&nbsp;&nbsp;Ampliar <i class="fa fa-bar-chart" aria-hidden="true"></i></button>
		<br>	
		
              
	</div> 
     
   </div><!--/row-->
   
   
    <!-- Nueva fila para los graficos-    -->
   
  
	  
	  	
				    
	<div class="row">						
				
		 <div class="col-md-12">  
			   
				<div id="grafico1"  >								 
					<div class="panel panel-default">		
			             <div id="graficoModal"  class="wow rotateIn"   style="animation-duration: 2s;"  data-wow-duration="2s" > </div>                
			             <p  style=" margin: 10px 190px 10px 30px; text-align:justify;font-weight: 500; font-style: Verdana; ">
					     	 Una caracteristica que se resalta es que si bien la cantidad de  donaciones de donantes femeninas es mayor que la de donantes masculinos, en las donaciones de donantes
					     	 Habituales los donantes masculinos predominan sobre las donantes femenimas, mientras que en las donaciones de donantes de Primera vez las donaciones predominantes son las femeninas
					     	  
					      </p>
			             
					      <button type="button" class="btn btn-primary btn-icon cerrarGrafico1Btn " ><i class="fa fa-search-plus" aria-hidden="true"></i>&nbsp;&nbsp;Cerrar <i class="fa fa-bar-chart" aria-hidden="true"></i></button>
					 </div>
				</div> 
				  
				<div id="grafico2" >									 
				    <div class="panel panel-default">	 
			              <div id="graficoPorcentaje"  class="wow rotateIn"   style="animation-duration: 2s;"  data-wow-duration="2s" > </div>                  
			              <p  style=" margin: 10px 190px 10px 30px; text-align:justify;font-weight: 500; font-style: Verdana; ">
			              Se visualiza la informaci&oacute;n en porcentaje de donaciones para cada sexo.
					      </p>
			             
					      <button type="button" class="btn btn-primary btn-icon cerrarGrafico2Btn " ><i class="fa fa-search-plus" aria-hidden="true"></i>&nbsp;&nbsp;Cerrar <i class="fa fa-bar-chart" aria-hidden="true"></i></button>
					     
					</div>
				</div>    	  
	   </div>							
				
  </div>
		
      
					    	  
				   
	
   
   
</div><!--/col-span-9-->
  
  	
  	