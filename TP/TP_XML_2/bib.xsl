<?xml version="1.0" encoding="UTF-8"?>

<!-- New document created with EditiX at Wed Nov 21 16:35:17 CET 2018 -->

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="html"/>
	
	<xsl:template match="/">
	<html>
		<h1> Domaines </h1>
		<body>
		<xsl:for-each select="bib/domain">
		<h2>
			<font color="blue" >
				<u>
					<xsl:value-of select="title"/>
				</u>
			</font >
		</h2>
		</xsl:for-each>
		
		
		</body>
	</html>
	</xsl:template>

</xsl:stylesheet>


