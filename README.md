# SAP_RFC_calls
RFC Call basic code

Steps to follow:
1. Download the code
2. Download and extract sapjco3-darwinintel64-3.1.5.zip
3. Provide sapjco3.jar in project librariy
4. check ABAP_AS_DEC.jcoDestination and enter below details:
  4.1 jco.client.ashost=34.210.142.28 //Crosscheck host name
  4.2 jco.client.sysnr=00     // crosscheck system number
  4.3 jco.client.client=200   // crosscheck ur client number
  4.4 jco.client.user="Provide ur username"
  4.5 jco.client.passwd="Provide ur password"
  4.6 jco.client.lang=en
5. All set and run to see the connection with SAP DEC system.
