<!doctype html>
<html lang="en">
	<head>
		<!-- Required meta tags -->
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

		
		<!-- Bootstrap CSS -->
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		
		<!-- jQuery first, then Popper.js, then Bootstrap JS -->
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
		
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">
		
		<!-- Optional CSS -->
		<link rel="stylesheet" type="text/css" href="static/css/style.css" />
		<!-- Optional JavaScript -->
		<script type="text/javascript" src="static/js/script.js"></script>

		<title>Gioco dell'Impiccato</title>
	</head>
	<body>
		<div class="container" style="text-align: center;">
			<div class="row">
				<div class="col-md-3">
					
				</div>
				<div class="col-md-6" style="min-width: 240px;">
					<input id="Casella_0" class="form-control" style="width: 40px; display: inline-block;" type="text" placeholder=" " readonly>
					<input id="Casella_1" class="form-control" style="width: 40px; display: inline-block;" type="text" placeholder=" " readonly>
					<input id="Casella_2" class="form-control" style="width: 40px; display: inline-block;" type="text" placeholder=" " readonly>
					<input id="Casella_3" class="form-control" style="width: 40px; display: inline-block;" type="text" placeholder=" " readonly>
					<input id="Casella_4" class="form-control" style="width: 40px; display: inline-block;" type="text" placeholder=" " readonly>
					<input id="Casella_5" class="form-control" style="width: 40px; display: inline-block;" type="text" placeholder=" " readonly>
				</div>
				<div class="col-md-3">
					
				</div>
			</div>
			<div class="clearfix"></div>
			
			<div class="row">
				<div class="col-md-3" style="text-align: left;">
					<input type="text" maxlength="1" id="lettera"> <br />
					<input id="codd" type="submit">
				</div>
				<div class="col-md-6">
					<div class="container">
						<div class="row" style="min-height: 65px">
							<div class="col-md-4">
								<img src="IMG/1.jpg" id="C_1" class="nascosto">
							</div>
							<div class="col-md-4">
								<img src="IMG/2.jpg" id="C_2" class="nascosto">
							</div>
							<div class="col-md-4">
								<img src="IMG/3.jpg" id="C_3" class="nascosto">
							</div>
						</div>
						<div class="clearfix"></div>
						<div class="row" style="min-height: 65px">
							<div class="col-md-4">
								<img src="IMG/4.jpg" id="C_4" class="nascosto">
							</div>
							<div class="col-md-4">
								<img src="IMG/5.jpg" id="C_5" class="nascosto">
							</div>
							<div class="col-md-4">
								<img src="IMG/6.jpg" id="C_6" class="nascosto">
							</div>
						</div>
						<div class="clearfix"></div>
						<div class="row" style="min-height: 65px">
							<div class="col-md-4">
								<img src="IMG/7.jpg" id="C_7" class="nascosto">
							</div>
							<div class="col-md-4">
								<img src="IMG/8.jpg" id="C_8" class="nascosto">
							</div>
							<div class="col-md-4">
								<img src="IMG/9.jpg" id="C_9" class="nascosto">
							</div>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
				<div class="col-md-3">
					<i id="iconcina" class="fa-solid fa-ghost" style="font-size:60px;display: none;"></i>
				</div>
			</div>
		</div>
	</body>
	<script>
		var errori=0;
		var parola="PAROLA";
		
		function perso() {
			$("#iconcina").css("color","red");
			$("#iconcina").css("display","block");
			
			setTimeout(function () {
				alert("hai perso");
			}, 200);
		}
		
		function vinto() {
			$("#iconcina").css("color","blue");
			$("#iconcina").css("display","block");
			
			setTimeout(function () {
				alert("hai vinto");
			}, 200);
		}
		
		function showElement(x) {
			if(errori>8) {
				return(false);
			}
			
			x=x.toUpperCase();
			var trovato=false;
			var vittoria=true;
			for (var i = 0; i < parola.length; i++) {
				if(x==parola.charAt(i)) {
					$("#Casella_"+i).attr("placeholder", parola.charAt(i));
					trovato=true;
				}
				
				if($("#Casella_"+i).attr('placeholder')==" ") {
					vittoria=false;
				}
			}
			
			if(vittoria==true) {
				vinto();
				return(true);
			}

			return(trovato);
		}

		function errore() {
			errori++;
			if(errori>=9) {
				for (var i = 0; i < parola.length; i++) {
					$("#Casella_"+i).attr("placeholder", parola.charAt(i));
				}
				perso();
			}

			$("#C_"+errori).css("display","block");
		}
		
		$(document).ready(function() {
			
		// Will accure at every click
		$("#codd").click(
			function() {
				if(showElement($("#lettera").val())==false) {
					errore();
				}
			}
		);
	});
						  
	</script>
</html>