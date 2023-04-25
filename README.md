# Case Transformation

The input in XML from the legacy system is transformed into the required JSON output format.

## XML-Input

```xml
<case>
  <id>42</id>
  <callerId>+41 42 42 4711</callerId>
  <description>Scratch near the rear door</description>
  <callDate>Fri 01.05.2021 14:20</callDate>
  <callDuration>23 min</callDuration>
  <operator>Oprah Torres</operator>
  <clientName>Arthur Dent</clientName>
  <clientId>4242</clientId>
</case>
```

## JSON-Output

```json
{
  "incidentId": 42,
  "shortDescription": "Scratch near the rear door",
  "reportDateTime": "01.05.2021 14:20",
  "clientId": 4242
}
```