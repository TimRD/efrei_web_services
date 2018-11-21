<?xml version="1.0" encoding="UTF-8"?>

<!-- New document created with EditiX at Wed Nov 21 10:05:33 CET 2018 -->

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="html"/>
	
	<xsl:template match="/">
	<html>
		<body>
				<table border="1">
					<xsl:for-each select="breakfast_menu/food">
					<div style="background-color:#009999">
						<font color="white" >
							 <b>
								<xsl:value-of select="name"/> - 
								<xsl:value-of select="price"/>
							</b>
						</font>
					</div>
					<div style="background-color:#d9d9d9">
						<xsl:value-of select="description"/>
					</div>					
					</xsl:for-each>
				</table>
		</body>
	</html>
	</xsl:template>

</xsl:stylesheet>


