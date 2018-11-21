<?xml version="1.0" encoding="UTF-8"?>

<!-- New document created with EditiX at Wed Nov 21 16:35:17 CET 2018 -->

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="html"/>
	
	<xsl:template match="/">
	<html>
		<body>
		<h1  align="left">Domaines</h1>
			<xsl:for-each select="bib/domain">
			<h2>
				<font color="blue" >
					<u>
						<xsl:value-of select="title"/>
					</u>
				</font >
			</h2>
			</xsl:for-each>
			<hr/>
			<hr/>
			
			<xsl:for-each select="bib/domain">
			
			<table border="1" width="100%">
				
<tbody>
				
	<tr>
				
		<td bgcolor="#c0c0c0" width="100%">
				
			<h2><xsl:value-of select="title"/></h2>
				
		</td>
				
	</tr>
				
</tbody>
			
</table>
			


</xsl:for-each>
			

			

<xsl:for-each select="bib/domain/bib_ref">
				
<hr/>
				<h3>Titre : <xsl:value-of select="title"/></h3>
				
Auteur(s) :  <xsl:value-of select="author"/>
				
<br/>
				
Année : <xsl:value-of select="year"/>
				
<br/>
				

Lien :
				
<font color="blue" >
				<u>
				<xsl:value-of select="weblink"/>
				
</u>
				</font >
				

<br/>
				
Commentaires:
				
<xsl:value-of select="comments"/>
				
<br/>
				
<br/>
				
<br/>
			

</xsl:for-each>
		</body>
	</html>
	</xsl:template>

</xsl:stylesheet>


