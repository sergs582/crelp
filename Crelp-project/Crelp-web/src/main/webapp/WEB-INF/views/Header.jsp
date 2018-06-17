<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">


<!-- Resources -->
<c:url var="bootstrapcss" value="/resources/vendor/bootstrap/css/bootstrap.min.css"></c:url>
<c:url var="mycss" value="/resources/css/one-page-wonder.min.css"></c:url>
<c:url var="myjquery" value="/resources/vendor/jquery/jquery.min.js"></c:url>
<c:url var="mybootstrapjs" value="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></c:url>


<!-- Links -->
<c:url var="Crelp" value="/./"></c:url>
<c:url var="signUp" value="/signUp"></c:url>
<c:url var="LogIn" value="/LogIn"></c:url>
<c:url var="Top-20" value="/Top-20"></c:url>
<c:url var="Ideas" value="/Ideas"></c:url>
<c:url var="Achievements" value="/Achievemeents"></c:url>
<c:url var="Contacts" value="/Contacts"></c:url>

    <!-- Bootstrap core CSS -->
    <link href="${bootstrapcss}" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="https://fonts.googleapis.com/css?family=Catamaran:100,200,300,400,500,600,700,800,900" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700,700i,900,900i" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${mycss}" rel="stylesheet">
    
    
    <!-- Bootstrap core JavaScript -->
    <script src="${myjquery}"></script>
    <script src="${mybootstrapjs}"></script>

  </head>

 
    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark navbar-custom fixed-top">
      <div class="container">
        <a class="navbar-brand" href="${Crelp}">Crelp.com</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link" href="${signUp}">Sign Up</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="${LogIn}">Log In</a>
            </li>
			    
					<li class="nav-item">
              <a class="nav-link" href="${Top-20}">Top-20 Ideas</a>
            </li>
               <li class="nav-item">
              <a class="nav-link" href="${Ideas}">All Ideas</a>
            </li>
             
              <li class="nav-item">
              <a  class="nav-link" href="${Achievements}">Our Achvements</a>
            </li>
           
           
               <li class="nav-item">
              <a class="nav-link" href="${Contacts}">Contacts</a>
            </li>
                  
          </ul>
        </div>
      </div>
    </nav>
