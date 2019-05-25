<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
 <div class="col-sm-10">
      	
   <!-- column 2 -->	
   <h3><i class="fa fa-hospital-o"></i> Banco Sangre</h3>             
   <hr>
      
   <div class="row">
      <!-- center left-->	
      <div class="col-md-9">
		  <div class="well"><h4>Grupo y Factor de las donaciones</h4></div>                 
         
              
           <div class="panel panel-default">

              <div class="panel-body">                    				
				  <br/>
				    <div class="row">
					    <div class="col-md-12">
					     <p  style=" margin: 10px; text-align:justify ">
			              El grupo y Factor predomiente en las donaciones es el <b>0+</b>, seguido del <b>A+</b>
					      </p>
					    </div>
				    </div>
				    <br/>
				    <div class="row">							
				
				      <div class="col-md-12">
			
				       <table id="example" class="display" style="width:100%">
						    <thead>
						      <tr>						        
						        <th>Grupo</th>
						        <th>Factor</th>
						        <th>Cantidad</th>					        					       
						      </tr>
						    </thead>
						    <tbody>						
						        <c:forEach items="${listaAbo}" var="u">						        
						      <tr>						      
						        <td><c:out value="${u.getGrupo()}"/></td>
						        <td><c:out value="${u.getFactor()}"/></td>
						        <td><c:out value="${u.getTotal()}"/></td>						       
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
		  <div id="donutchart" style="width:220px; height: 270px; "> </div> 			
         </div> 	
		<!-- Trigger the modal with a button -->
		<button type="button" class="btn btn-primary btn-icon openBtn " ><i class="fa fa-search-plus" aria-hidden="true"></i>&nbsp;&nbsp; <i class="fa fa-bar-chart" aria-hidden="true"></i></button>
		
		<!-- Modal -->
		<div class="modal fade" id="myModal" role="dialog">
		    <div class="modal-dialog modal-lg">
		        <!-- Modal content-->
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal">×</button>
		                <h4 class="modal-title">Grafico de Grupo y Factor</h4>
		            </div>
		            <div class="modal-body">
		             <div id="donutchartModal" style="width:900px; height: 600px; "> </div>
		            </div>
		            <div class="modal-footer">
		                <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
		            </div>
		            
		        </div>
		        
		    </div>
		</div>

              
	</div> 
     
   </div><!--/row-->
</div><!--/col-span-9-->
  