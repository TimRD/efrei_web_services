<?xml version="1.0" encoding="UTF-8"?>

<!-- New document created with EditiX at Wed Nov 21 10:05:33 CET 2018 -->

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html"/>

	<xsl:template match="/">
	<html> 
		<body> 
			<xsl:apply-templates/> 
		</body> 
	</html>
	</xsl:template>
	
	
	<xsl:template match="food">
	
<table border="1">
		<div style="background-color:#009999">
			<xsl:apply-templates select="name"/>
			<xsl:apply-templates select="price"/>
		</div>
		<xsl:apply-templates select="description"/>
		<xsl:apply-templates select="calories"/>
	</table>
	</xsl:template>
	
	
	
	<xsl:template  match="name">
		<font color="white" >
			<b>
				<xsl:value-of select="."/>
  -
			</b>
		</font>
	</xsl:template>

	
<xsl:template  match="price">
		<font color="white" >
			<b>
				<xsl:value-of select="."/>
			</b>
		</font>
	</xsl:template>
	
	<xsl:template  match="description">
		<div style="background-color:#d9d9d9">
			<xsl:value-of select="."/>
		</div>
	</xsl:template>
	
	<xsl:template  match="calories">
		<div style="background-color:#d9d9d9">
			<xsl:value-of select="."/>
 (calories per serving)
		</div>
	</xsl:template>

</xsl:stylesheet>


