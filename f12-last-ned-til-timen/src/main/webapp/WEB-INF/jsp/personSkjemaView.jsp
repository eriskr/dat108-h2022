<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h3>Hei. Tast inn informasjon om personen</h3>
	<%--@elvariable id="person" type="no.hvl.dat108.f12.Person"--%>
	<form:form acceptCharset="lagrePerson" method="post" modelAttribute="person"> <!-- action refererer til controller-->

		<form:label path="navn">Navn</form:label>
		<form:input path="navn"/> <br>
		<form:label path="mobil">Mobil</form:label>
		<form:input path="mobil"/> <br>
		<form:label path="hoydecm">Høyde i cm</form:label>
		<form:input path="hoydecm"/> <br>
		<form:label path="fdato">Fødselsdato</form:label>
		<form:input path="fdato"/> <br>

		<input type="sumbit" value="Lagre"/>

	</form:form>
</body>
</html>