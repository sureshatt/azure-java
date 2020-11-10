# Azure Storage 
## Authentication using shared-key
Authentication using shared key does not directly use the key against the API, instead it generates a MAC using the Key and the Date header field. 

```text
GET /?comp=list HTTP/1.1
host: xxxxxxxxxx.blob.core.windows.net
accept: */*
Date: Tue, 10 Nov 2020 01:13:41 GMT
Authorization: SharedKey xxxxxxxxx:dLkuH2awDsULG+Y9PnVZv+s5nkwc9KwpkQYc1Wn2JOJs=
x-ms-version: 2019-07-07
x-ms-client-request-id: 40dd3d7e-b2d3-45c8-83a1-dc16223ebf9b
User-Agent: azsdk-java-azure-storage-blob/12.6.0 (11.0.2; Mac OS X 10.15.7)
content-length: 0

HTTP/1.1 200 OK
Transfer-Encoding: chunked
Content-Type: application/xml
Server: Windows-Azure-Blob/1.0 Microsoft-HTTPAPI/2.0
x-ms-request-id: 26c9c58e-501e-0046-41fe-b6cb91000000
x-ms-client-request-id: 40dd3d7e-b2d3-45c8-83a1-dc16223ebf9b
x-ms-version: 2019-07-07
Date: Tue, 10 Nov 2020 01:13:41 GMT

...<?xml version="1.0" encoding="utf-8"?><EnumerationResults ServiceEndpoint="http://xxxxxxxx.blob.core.windows.net/"><Containers><Container><Name>quickstartblobs1b2e5517-1ff0-4e05-8d63-6a9307e7800a</Name><Properties><Last-Modified>Tue, 10 Nov 2020 00:49:58 GMT</Last-Modified><Etag>"0x8D885128C9A4DA9"</Etag><LeaseStatus>unlocked</LeaseStatus><LeaseState>available</LeaseState><DefaultEncryptionScope>$account-encryption-key</DefaultEncryptionScope><DenyEncryptionScopeOverride>false</DenyEncryptionScopeOverride><HasImmutabilityPolicy>false</HasImmutabilityPolicy><HasLegalHold>false</HasLegalHold></Properties></Container><Container><Name>quickstartblobs28110246-5b3a-4297-b81a-b207166d8a26</Name><Properties><Last-Modified>Tue, 10 Nov 2020 01:04:36 GMT</Last-Modified><Etag>"0x8D8851497DB1893"</Etag><LeaseStatus>unlocked</LeaseStatus><LeaseState>available</LeaseState><DefaultEncryptionScope>$account-encryption-key</DefaultEncryptionScope><DenyEncryptionScopeOverride>false</DenyEncryptionScopeOverride><HasImmutabilityPolicy>false</HasImmutabilityPolicy><HasLegalHold>false</HasLegalHold></Properties></Container><Container><Name>quickstartblobs9dced6de-64bb-41d9-9769-c1450c67cd00</Name><Properties><Last-Modified>Tue, 10 Nov 2020 00:55:11 GMT</Last-Modified><Etag>"0x8D8851347093469"</Etag><LeaseStatus>unlocked</LeaseStatus><LeaseState>available</LeaseState><DefaultEncryptionScope>$account-encryption-key</DefaultEncryptionScope><DenyEncryptionScopeOverride>false</DenyEncryptionScopeOverride><HasImmutabilityPolicy>false</HasImmutabilityPolicy><HasLegalHold>false</HasLegalHold></Properties></Container><Container><Name>quickstartblobsac6b7ac8-2da7-44f6-8db1-dea120af8f29</Name><Properties><Last-Modified>Mon, 09 Nov 2020 23:38:10 GMT</Last-Modified><Etag>"0x8D8850884C705BC"</Etag><LeaseStatus>unlocked</LeaseStatus><LeaseState>available</LeaseState><DefaultEncryptionScope>$account-encryption-key</DefaultEncryptionScope><DenyEncryptionScopeOverride>false</DenyEncryptionScopeOverride><HasImmutabilityPolicy>false</HasImmutabilityPolicy><HasLegalHold>false</HasLegalHold></Properties></Container><Container><Name>quickstartblobsc91cd374-8efe-4727-b972-3896bba58d95</Name><Properties><Last-Modified>Tue, 10 Nov 2020 01:12:38 GMT</Last-Modified><Etag>"0x8D88515B7321C17"</Etag><LeaseStatus>unlocked</LeaseStatus><LeaseState>available</LeaseState><DefaultEncryptionScope>$account-encryption-key</DefaultEncryptionScope><DenyEncryptionScopeOverride>false</DenyEncryptionScopeOverride><HasImmutabilityPolicy>false</HasImmutabilityPolicy><HasLegalHold>false</HasLegalHold></Properties></Container><Container><Name>quickstartblobsd3dae4f4-1aa9-413b-81e8-20e2a564e5b2</Name><Properties><Last-Modified>Tue, 10 Nov 2020 00:57:26 GMT</Last-Modified><Etag>"0x8D885139734B1F0"</Etag><LeaseStatus>unlocked</LeaseStatus><LeaseState>available</LeaseState><DefaultEncryptionScope>$account-encryption-key</DefaultEncryptionScope><DenyEncryptionScopeOverride>false</DenyEncryptionScopeOverride><HasImmutabilityPolicy>false</HasImmutabilityPolicy><HasLegalHold>false</HasLegalHold></Properties></Container><Container><Name>quickstartblobsd4e6c4da-ac58-413f-a371-17d0f198fa8c</Name><Properties><Last-Modified>Tue, 10 Nov 2020 00:50:43 GMT</Last-Modified><Etag>"0x8D88512A757DFF8"</Etag><LeaseStatus>unlocked</LeaseStatus><LeaseState>available</LeaseState><DefaultEncryptionScope>$account-encryption-key</DefaultEncryptionScope><DenyEncryptionScopeOverride>false</DenyEncryptionScopeOverride><HasImmutabilityPolicy>false</HasImmutabilityPolicy><HasLegalHold>false</HasLegalHold></Properties></Container><Container><Name>quickstartblobsd6be2e4e-ea93-4c6c-b9ad-db39fe2740b8</Name><Properties><Last-Modified>Mon, 09 Nov 2020 23:35:47 GMT</Last-Modified><Etag>"0x8D885082F489BF6"</Etag><LeaseStatus>unlocked</LeaseStatus><LeaseState>available</LeaseState><DefaultEncryptionScope>$account-encryption-key</DefaultEncryptionScope><DenyEncryptionScopeOverride>false</DenyEncryptionScopeOverride><HasImmutabilityPolicy>false</HasImmutabilityPolicy><HasLegalHold>false</HasLegalHold></Properties></Container><Container><Name>test</Name><Properties><Last-Modified>Mon, 09 Nov 2020 22:56:59 GMT</Last-Modified><Etag>"0x8D88502C413D376"</Etag><LeaseStatus>unlocked</LeaseStatus><LeaseState>available</LeaseState><DefaultEncryptionScope>$account-encryption-key</DefaultEncryptionScope><DenyEncryptionScopeOverride>false</DenyEncryptionScopeOverride><HasImmutabilityPolicy>false</HasImmutabilityPolicy><HasLegalHold>false</HasLegalHold></Properties></Container></Containers><NextMarker /></EnumerationResults>
```
### Authentication failure error message
```xml
<Error>
    <Code>AuthenticationFailed</Code>
    <Message>Server failed to authenticate the request. Make sure the value of Authorization header is formed correctly including the signature.
RequestId:f6e673ee-001e-0055-2dff-b6fe70000000
Time:2020-11-10T01:21:15.0792948Z</Message>
    <AuthenticationErrorDetail>The MAC signature found in the HTTP request 'dLkuH2awDsULG+Y9PNVZv+s5nwc9KwpkQYc1Wn2JCJs=' is not the same as any computed signature. Server used following string to sign: 'GET


Tue, 10 Nov 2020 01:13:41 GMT
/csb10032000d94ebb0f/?comp=list'.</AuthenticationErrorDetail>
</Error>
```

## Authentication with Shared Access Signature 
- The SAS is generated in the portal with restricted rights. 
- Insufficient rights in the SAS token results in HTTP 403
- During the SAS generation, the Signing Key can be selected (ex: key1)
- Once SAS is generated, the Blog service SAS URL can be used to access the blog storage directly, for example using Postman or browser.
- Rotating the Signing Key (ex: key1) causes the generated SAS tokens to be invalid

```text
GET /?comp=list&sv=2019-12-12&ss=b&srt=sco&sp=rlx&se=2020-11-11T09:40:04Z&st=2020-11-10T01:40:04Z&spr=https,http&sig=Wr111xvyvwolWNI1KxxxxxxxxTu9R%2Bf0aAOHaV%2FnSe2iY%3D HTTP/1.1
host: xxxxxxxxxx.blob.core.windows.net
accept: */*
Date: Tue, 10 Nov 2020 01:45:54 GMT
x-ms-version: 2019-07-07
x-ms-client-request-id: 32222d0d-00fc-4bef-885c-0b478cf08900
User-Agent: azsdk-java-azure-storage-blob/12.6.0 (11.0.2; Mac OS X 10.15.7)
content-length: 0

HTTP/1.1 200 OK
Transfer-Encoding: chunked
Content-Type: application/xml
Server: Windows-Azure-Blob/1.0 Microsoft-HTTPAPI/2.0
x-ms-request-id: 9adac78e-201e-0006-7803-b7e27f000000
x-ms-client-request-id: 32222d0d-00fc-4bef-885c-0b478cf08900
x-ms-version: 2019-07-07
Date: Tue, 10 Nov 2020 01:45:55 GMT

...<?xml version="1.0" encoding="utf-8"?><EnumerationResults ServiceEndpoint="http://xxxxxxxxx.blob.core.windows.net/"><Containers><Container><Name>quickstartblobs1b2e5517-1ff0-4e05-8d63-6a9307e7800a</Name><Properties><Last-Modified>Tue, 10 Nov 2020 00:49:58 GMT</Last-Modified><Etag>"0x8D885128C9A4DA9"</Etag><LeaseStatus>unlocked</LeaseStatus><LeaseState>available</LeaseState><DefaultEncryptionScope>$account-encryption-key</DefaultEncryptionScope><DenyEncryptionScopeOverride>false</DenyEncryptionScopeOverride><HasImmutabilityPolicy>false</HasImmutabilityPolicy><HasLegalHold>false</HasLegalHold></Properties></Container><Container><Name>quickstartblobs28110246-5b3a-4297-b81a-b207166d8a26</Name><Properties><Last-Modified>Tue, 10 Nov 2020 01:04:36 GMT</Last-Modified><Etag>"0x8D8851497DB1893"</Etag><LeaseStatus>unlocked</LeaseStatus><LeaseState>available</LeaseState><DefaultEncryptionScope>$account-encryption-key</DefaultEncryptionScope><DenyEncryptionScopeOverride>false</DenyEncryptionScopeOverride><HasImmutabilityPolicy>false</HasImmutabilityPolicy><HasLegalHold>false</HasLegalHold></Properties></Container><Container><Name>quickstartblobs65557880-1649-4df3-ab91-66ddf81779b1</Name><Properties><Last-Modified>Tue, 10 Nov 2020 01:13:42 GMT</Last-Modified><Etag>"0x8D88515DD3F0893"</Etag><LeaseStatus>unlocked</LeaseStatus><LeaseState>available</LeaseState><DefaultEncryptionScope>$account-encryption-key</DefaultEncryptionScope><DenyEncryptionScopeOverride>false</DenyEncryptionScopeOverride><HasImmutabilityPolicy>false</HasImmutabilityPolicy><HasLegalHold>false</HasLegalHold></Properties></Container><Container><Name>quickstartblobs9dced6de-64bb-41d9-9769-c1450c67cd00</Name><Properties><Last-Modified>Tue, 10 Nov 2020 00:55:11 GMT</Last-Modified><Etag>"0x8D8851347093469"</Etag><LeaseStatus>unlocked</LeaseStatus><LeaseState>available</LeaseState><DefaultEncryptionScope>$account-encryption-key</DefaultEncryptionScope><DenyEncryptionScopeOverride>false</DenyEncryptionScopeOverride><HasImmutabilityPolicy>false</HasImmutabilityPolicy><HasLegalHold>false</HasLegalHold></Properties></Container><Container><Name>quickstartblobsac6b7ac8-2da7-44f6-8db1-dea120af8f29</Name><Properties><Last-Modified>Mon, 09 Nov 2020 23:38:10 GMT</Last-Modified><Etag>"0x8D8850884C705BC"</Etag><LeaseStatus>unlocked</LeaseStatus><LeaseState>available</LeaseState><DefaultEncryptionScope>$account-encryption-key</DefaultEncryptionScope><DenyEncryptionScopeOverride>false</DenyEncryptionScopeOverride><HasImmutabilityPolicy>false</HasImmutabilityPolicy><HasLegalHold>false</HasLegalHold></Properties></Container><Container><Name>quickstartblobsc91cd374-8efe-4727-b972-3896bba58d95</Name><Properties><Last-Modified>Tue, 10 Nov 2020 01:12:38 GMT</Last-Modified><Etag>"0x8D88515B7321C17"</Etag><LeaseStatus>unlocked</LeaseStatus><LeaseState>available</LeaseState><DefaultEncryptionScope>$account-encryption-key</DefaultEncryptionScope><DenyEncryptionScopeOverride>false</DenyEncryptionScopeOverride><HasImmutabilityPolicy>false</HasImmutabilityPolicy><HasLegalHold>false</HasLegalHold></Properties></Container><Container><Name>quickstartblobsd3dae4f4-1aa9-413b-81e8-20e2a564e5b2</Name><Properties><Last-Modified>Tue, 10 Nov 2020 00:57:26 GMT</Last-Modified><Etag>"0x8D885139734B1F0"</Etag><LeaseStatus>unlocked</LeaseStatus><LeaseState>available</LeaseState><DefaultEncryptionScope>$account-encryption-key</DefaultEncryptionScope><DenyEncryptionScopeOverride>false</DenyEncryptionScopeOverride><HasImmutabilityPolicy>false</HasImmutabilityPolicy><HasLegalHold>false</HasLegalHold></Properties></Container><Container><Name>quickstartblobsd4e6c4da-ac58-413f-a371-17d0f198fa8c</Name><Properties><Last-Modified>Tue, 10 Nov 2020 00:50:43 GMT</Last-Modified><Etag>"0x8D88512A757DFF8"</Etag><LeaseStatus>unlocked</LeaseStatus><LeaseState>available</LeaseState><DefaultEncryptionScope>$account-encryption-key</DefaultEncryptionScope><DenyEncryptionScopeOverride>false</DenyEncryptionScopeOverride><HasImmutabilityPolicy>false</HasImmutabilityPolicy><HasLegalHold>false</HasLegalHold></Properties></Container><Container><Name>quickstartblobsd6be2e4e-ea93-4c6c-b9ad-db39fe2740b8</Name><Properties><Last-Modified>Mon, 09 Nov 2020 23:35:47 GMT</Last-Modified><Etag>"0x8D885082F489BF6"</Etag><LeaseStatus>unlocked</LeaseStatus><LeaseState>available</LeaseState><DefaultEncryptionScope>$account-encryption-key</DefaultEncryptionScope><DenyEncryptionScopeOverride>false</DenyEncryptionScopeOverride><HasImmutabilityPolicy>false</HasImmutabilityPolicy><HasLegalHold>false</HasLegalHold></Properties></Container><Container><Name>test</Name><Properties><Last-Modified>Mon, 09 Nov 2020 22:56:59 GMT</Last-Modified><Etag>"0x8D88502C413D376"</Etag><LeaseStatus>unlocked</LeaseStatus><LeaseState>available</LeaseState><DefaultEncryptionScope>$account-encryption-key</DefaultEncryptionScope><DenyEncryptionScopeOverride>false</DenyEncryptionScopeOverride><HasImmutabilityPolicy>false</HasImmutabilityPolicy><HasLegalHold>false</HasLegalHold></Properties></Container></Containers><NextMarker /></EnumerationResults>
```