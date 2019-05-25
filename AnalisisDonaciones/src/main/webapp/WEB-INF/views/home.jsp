<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
 <div class="col-sm-10">
      	
      <!-- column 2 -->	
       <h3><i class="fa fa-hospital-o"></i> Banco Sangre</h3>  
            
       <hr>
      
	   <div class="row">
         <!-- center left-->	
         <div class="col-md-10">
		  <!--  <div class="well" > <h3 align="center"> Analisis de Donaciones </h3> </div> -->
                        
              
           <div class="panel panel-default">
         
              <div class="divpanel-body"> 
                     
				  <div class="row">
					 
					   <div class="col-md-12">
					 		     	<div class="img-responsive wow rotateIn" data-wow-duration="2s" data-wow-delay="1s"   id="imagenInicial" >
					    <img  src="resources/imagenes/imagenInicio.jpg" style="width:100%;height:300px"/>
					    </div>	
					   </div>	
				   </div>		          				
				   <br/>			  
				   <div class="row">							
				
				      <div class="col-md-6" >			
				     	
				     	<a style=" margin: 10px" href="<c:url value="/donaciones" />"  title="Donaciones por tipo de Donantes" data-toggle="tooltip"> <i class="fa fa-heart"></i>&nbsp;&nbsp; Donaciones </a>
				     	<p  style=" margin: 20px; text-align:justify ">
				     	  Donaciones por tipo de Donante. Podemos observar que cuando las donaciones pertenen a un donante Habitual la cantidad de donaciones que se rechazan es mucho
				     	  menor que cuando es un donante no habitual y mas aun cuando el donante dona por primera vez
				     	</p>			     				     					 
				      		                   
					 </div>	
					   <div class="col-md-6" >			
				     	<a style=" margin: 10px" href="<c:url value="/rangoEdad" />" title="Donaciones por Rango de Edad" data-toggle="tooltip"><i class="fa fa-calendar-times-o"></i>&nbsp;&nbsp;Edad Donantes</a>
				     	<p  style=" margin: 20px; text-align:justify ">
				     	 Visualizan donaciones agrupadas por rango de edad de los donantes. 
				     	</p>			     				     					 
				      		                   
					 </div>	
					
					</div>
					 <div class="row">							
				
				    
					 <div class="col-md-6" >			
				     	<a style=" margin: 10px" href="<c:url value="/sexoDonaciones" />" title="Donaciones por Sexo de los Donantes" data-toggle="tooltip"> <i class="glyphicon glyphicon-user"></i>&nbsp;&nbsp;Sexo</a>
				     	<p  style=" margin: 20px; text-align:justify ">
				     	 En esta seccion se observan las donaciones agrupadas por sexo de los donantes.
				     	</p>	                   
					 </div>	
					 <div class="col-md-6" >			
				     	<a style=" margin: 10px" href="<c:url value="/aboGroup" />" title="Donaciones por Grupo y Factor" data-toggle="tooltip"> <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;Grupo y Factor </a>
				     	<p  style=" margin: 20px; text-align:justify ">
				     	 Se muestran las donaciones agrupadas por grupo y factor de los donantes.
				     	</p>                 
					 </div>	
					
					</div>
					
					 		
				


              </div><!--/panel-body-->
             </div><!--/panel-->                     
              
          </div><!--/col-->
         
          <!--center-right-->
          <div class="col-md-2">                             
         
              
	      </div> <!--/col-span-6-->
     
       </div><!--/row-->
  	</div><!--/col-span-9-->
  	
  	