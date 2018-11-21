<?xml version="1.0" encoding="UTF-8"?>

<!-- New document created with EditiX at Wed Nov 21 10:05:33 CET 2018 -->

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="html"/>
	<xsl:template match="/">
	<html> 
		<body> 
			<h2>Breakfast</h2> 
			<xsl:apply-templates/> 
		</body> 
	</html>
	</xsl:template>
	
	<xsl:templatematch="food">
	<p>
		<xsl:apply-templates select="name"/> 
		<xsl:apply-templates select="price"/>
	</p>
	</xsl:templatematch="food">
			
	<xsl:templatematch="name">
		<span style="color:#ff0000"> 
			<xsl:value-of select="."/>
		</span>
	</xsl:template>
					
	<xsl:templatematch="price">
		<span style="color:#ff0000"> 
			<xsl:value-of select="."/>
		</span>
	</xsl:template>
</xsl:stylesheet>


