<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html lang="en">
<head>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<meta charset="utf-8">
	<title>Analisis Donaciones</title>
	<meta name="generator" content="Bootply" />
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">				
		
		
	<!-- All the files that are required -->
	<!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	    <link href='http://fonts.googleapis.com/css?family=Varela+Round' rel='stylesheet' type='text/css'>
	-->
	
	<link rel="stylesheet" href="resources/bootstrap/3.3.7/css/bootstrap.min.css">
	<link href="resources/css/fuente.google.css" rel='stylesheet' type='text/css'>
	<link href="resources/css/animate.min.css" rel="stylesheet" type="text/css" />
	
	<link href="resources/css/style.css" rel='stylesheet' type='text/css'>
	<link href="resources/font-awesome/4.7.0/css/font-awesome.css" type="text/css" rel="stylesheet"/>
	<link href="resources/font-awesome/4.7.0/css/font-awesome.min-jsf.css" type="text/css" />
	
	<link rel="stylesheet" href="resources/datatables/1.10.15/css/jquery.dataTables.min.css">
	<link href="resources/css/dataTables.css" rel='stylesheet' type='text/css'>
	
	
	
	<!--
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.13.1/jquery.validate.min.js"></script>
	-->
	
	

	<!--<script src="resources/jquery/3.2.0/webjars-requirejs.js"></script> -->
	
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />	
	<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
 		
</head>

<body>
<!-- Header -->
<div id="top-nav" class="navbar navbar-inverse navbar-static-top">
  <div class="page-container row-fluid container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <span class="icon-toggle"></span>
      </button>
      <a class="navbar-brand" href="<c:url value="/" />">Analisis Donaciones</a>
      
    </div>
      
    
  </div><!-- /container -->
</div>
<!-- /Header -->

<!-- Main -->
<div class="page-container row-fluid container-fluid">
  
  <!-- upper section -->
  <div class="row">
	<div class="col-sm-2">
      <!-- left -->
      <h3><i class="fa fa-list-alt"></i> Menu</h3>
      <hr>
      
      <ul class="nav nav-stacked">
        <li><a href="<c:url value="/donaciones" />"  title="Donaciones por tipo de Donantes" data-toggle="tooltip"> <i class="fa fa-heart"></i>&nbsp;&nbsp;Donaciones </a></li>
        <!-- <li><a href="<c:url value="/abo" />"  title="Grupo y factor de las donaciones" data-toggle="tooltip"> <i class="glyphicon glyphicon-plus"></i>  Grupo y Factor </a></li> -->        
        <li><a href="<c:url value="/rangoEdad" />" title="Donaciones por Rango de Edad" data-toggle="tooltip"><i class="fa fa-calendar-times-o"></i>&nbsp;&nbsp;Edad Donantes</a></li>
        <li><a href="<c:url value="/sexoDonaciones" />" title="Donaciones por Sexo de los Donantes" data-toggle="tooltip"> <i class="glyphicon glyphicon-user"></i>&nbsp;&nbsp;Sexo</a></li>
        <li><a href="<c:url value="/aboGroup" />" title="Donaciones por Grupo y Factor" data-toggle="tooltip"> <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;Grupo y Factor </a></li>
             
	      
      </ul>
      
      <hr>
      
  	</div><!-- /span-3 -->
  	
  	
	<script src="resources/jquery/3.2.0/jquery.js"></script>
	<script src="resources/jquery/3.2.0/jquery.min.js"></script>
	

    <script src="resources/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="resources/datatables/1.10.15/js/jquery.dataTables.min.js"></script>
	<script src="resources/datatables/1.10.15/js/dataTables.bootstrap.js"></script>
	
	<script src="resources/js/wow.min.js" type="text/javascript"></script>
	<script src="resources/js/wow.min.js"></script>
    <script>
        new WOW().init();
        $('[data-toggle="tooltip"]').tooltip();
    </script>
    
     <c:import url="${paginaIncluir}.jsp" />
    
  </div><!--/row-->
  <!-- /upper section -->
  
  <!-- lower section -->
    
  <div class="row">
    <br>
     <!--  
     <div class="alert alert-info">
       
    
     </div>
     -->
  </div>
    
    
</div><!--/row  yo container-->
  

<!-- /Main --> 

 <script src="resources/js/${paginaIncluir}.js"></script>    

  
</body>
</html>
