<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1488243173489" ID="ID_1283278359" MODIFIED="1488319323470" TEXT="facer">
<icon BUILTIN="ksmiletris"/>
<node CREATED="1488243189468" ID="ID_874339549" MODIFIED="1488556615910" POSITION="right" TEXT="Use Cases">
<node CREATED="1488498981957" ID="ID_996019635" MODIFIED="1488498983938" TEXT="User">
<node CREATED="1488312477327" ID="ID_1789873431" MODIFIED="1488312513492" TEXT="New User">
<node CREATED="1488312496531" ID="ID_280711500" MODIFIED="1488556572346" TEXT="Submit">
<node CREATED="1488556556778" ID="ID_911358829" MODIFIED="1488556559211" TEXT="Login"/>
<node CREATED="1488556560262" ID="ID_504650310" MODIFIED="1488556562050" TEXT="Password"/>
<node CREATED="1488556563007" ID="ID_1527812756" MODIFIED="1488556566779" TEXT="Email Address"/>
</node>
<node CREATED="1488312499212" ID="ID_131014243" MODIFIED="1488312504531" TEXT="Verify identity"/>
</node>
<node CREATED="1488498999067" ID="ID_763993587" MODIFIED="1488499003085" TEXT="User Management">
<node CREATED="1488312545160" ID="ID_24044696" MODIFIED="1488312556562" TEXT="App selection"/>
<node CREATED="1488497795104" ID="ID_397324079" MODIFIED="1488497801314" TEXT="Component Selection"/>
<node CREATED="1488312557569" ID="ID_730820618" MODIFIED="1488312571881" TEXT="Incident Subscription"/>
</node>
</node>
<node CREATED="1488312524791" ID="ID_635044680" MODIFIED="1488556403615" TEXT="Events">
<node CREATED="1488327513406" ID="ID_900939703" MODIFIED="1488556412209" TEXT="Data In">
<node CREATED="1488327578831" ID="ID_1308375516" MODIFIED="1488327587957" TEXT="Source">
<node CREATED="1488327541350" ID="ID_106018868" MODIFIED="1488327559771" TEXT="Current Emails"/>
<node CREATED="1488327544692" ID="ID_1208014441" MODIFIED="1488327547466" TEXT="Server Monitoring"/>
<node CREATED="1488327548454" ID="ID_1654389247" MODIFIED="1488327551611" TEXT="Database Monitoring"/>
</node>
<node CREATED="1488327589311" ID="ID_1257132484" MODIFIED="1488556451577" TEXT="Load Methods">
<node CREATED="1488327611881" ID="ID_1534459928" MODIFIED="1488327618429" TEXT="Database to Database"/>
<node CREATED="1488327619193" ID="ID_1619086273" MODIFIED="1488327636620" TEXT="Email &gt; Pull &gt; Categorize"/>
</node>
</node>
<node CREATED="1488327521789" ID="ID_1745661714" MODIFIED="1488556463893" TEXT="Event Types">
<node CREATED="1488243194769" ID="ID_1779383081" MODIFIED="1488243280627" TEXT="Off/On">
<node CREATED="1488243281869" ID="ID_874572714" MODIFIED="1488243307595" TEXT="Alert:  Server Down"/>
<node CREATED="1488243296389" ID="ID_49172432" MODIFIED="1488243303228" TEXT="Clear: Server Up"/>
</node>
<node CREATED="1488243238356" ID="ID_1748505285" MODIFIED="1488327528816" TEXT="Leaky Bucket">
<node CREATED="1488243313015" ID="ID_1750039598" MODIFIED="1488243349086" TEXT="Alert:  &gt; x occurences per time frame"/>
<node CREATED="1488243350096" ID="ID_269428108" MODIFIED="1488243366813" TEXT="Clear:  &lt; y occurences per time frame"/>
</node>
<node CREATED="1488243369219" ID="ID_467678367" MODIFIED="1488312587719" TEXT="Tracking">
<node CREATED="1488243423466" ID="ID_1994711740" MODIFIED="1488243432984" TEXT="Track occurences between alerts"/>
<node CREATED="1488243383353" ID="ID_1650619729" MODIFIED="1488244625832" TEXT="Alert:  Periodically (Daily/Weekly) with count"/>
</node>
</node>
</node>
<node CREATED="1488314753290" ID="ID_1106311274" MODIFIED="1488314759730" TEXT="Report Incident">
<node CREATED="1488314789828" ID="ID_99024489" MODIFIED="1488314818989" TEXT="Monitor + Rules &gt;&gt; Incident"/>
<node CREATED="1488314960316" ID="ID_1406171158" MODIFIED="1488314962669" TEXT="Push">
<node CREATED="1488314824475" ID="ID_1170185129" MODIFIED="1488314978570" TEXT="Subscription for Incident Type">
<node CREATED="1488314919487" ID="ID_471795687" MODIFIED="1488314921523" TEXT="Group"/>
<node CREATED="1488314922312" ID="ID_664155603" MODIFIED="1488314924772" TEXT="User"/>
</node>
<node CREATED="1488314932648" ID="ID_891453084" MODIFIED="1488314940749" TEXT="Message to Subscribers">
<node CREATED="1488315020901" ID="ID_1698743895" MODIFIED="1488315058553" TEXT="App Notification"/>
<node CREATED="1488315023510" ID="ID_1077375092" MODIFIED="1488315025791" TEXT="Text"/>
<node CREATED="1488315027260" ID="ID_825443230" MODIFIED="1488315028820" TEXT="Email"/>
</node>
</node>
<node CREATED="1488314980531" ID="ID_481532481" MODIFIED="1488314982554" TEXT="Pull">
<node CREATED="1488314997644" ID="ID_278435544" MODIFIED="1488315001756" TEXT="User Connects"/>
<node CREATED="1488315363312" ID="ID_169465348" MODIFIED="1488315380395" TEXT="Subscription - Group/User"/>
<node CREATED="1488315255185" ID="ID_1711537699" MODIFIED="1488315447817" TEXT="Active Incidents for Subscription"/>
</node>
</node>
<node CREATED="1488561564999" ID="ID_5952704" MODIFIED="1488561567980" TEXT="Messaging">
<node CREATED="1488561603165" ID="ID_1088048976" MODIFIED="1488561607695" TEXT="Incident">
<node CREATED="1488558828510" ID="ID_427989831" MODIFIED="1488558832490" TEXT="Incident Happens"/>
<node CREATED="1488558833566" ID="ID_1153328814" MODIFIED="1488561583962" TEXT="Subscription">
<node CREATED="1488558839669" ID="ID_1937073074" MODIFIED="1488561232810" TEXT="Identify Logins to Notify"/>
<node CREATED="1488561234589" ID="ID_593870746" MODIFIED="1488561455786" TEXT="Insert Record to Message Pending table"/>
</node>
</node>
<node CREATED="1488558878682" ID="ID_647186550" MODIFIED="1488561591491" TEXT="User to User">
<node CREATED="1488558839669" ID="ID_1178612495" MODIFIED="1488561482912" TEXT="User Message to Login"/>
<node CREATED="1488561234589" ID="ID_714710780" MODIFIED="1488561455786" TEXT="Insert Record to Message Pending table"/>
</node>
<node CREATED="1488558822606" ID="ID_682633324" MODIFIED="1488561645589" TEXT="Data Push">
<node CREATED="1488561401306" ID="ID_1194361718" MODIFIED="1488561403281" TEXT="Message">
<node CREATED="1488561404821" ID="ID_1582242057" MODIFIED="1488561426178" TEXT="Unsent messages for Login?"/>
<node CREATED="1488561277154" ID="ID_1193750318" MODIFIED="1488561287446" TEXT="Send message">
<node CREATED="1488561503714" ID="ID_73723546" MODIFIED="1488561532325" TEXT="For Incidents &gt; Include the current state (Active, Resolved)"/>
</node>
<node CREATED="1488558855213" ID="ID_327048702" MODIFIED="1488561324061" TEXT="Message Received?">
<node CREATED="1488561308817" ID="ID_1442825147" MODIFIED="1488561316142" TEXT="Yes &gt; Mark as sent in table"/>
<node CREATED="1488558864309" ID="ID_1809623062" MODIFIED="1488561342844" TEXT="No &gt; Retry or Send to next Contact for Login"/>
</node>
</node>
</node>
<node CREATED="1488558535931" ID="ID_1303024340" MODIFIED="1488561640451" TEXT="Data Pull">
<node CREATED="1488558576494" ID="ID_1146418618" MODIFIED="1488558906702" TEXT="App &gt; Request Data - Provide Login"/>
<node CREATED="1488558610058" ID="ID_435282182" MODIFIED="1488558783933" TEXT="Current State">
<node CREATED="1488558784817" ID="ID_1924372799" MODIFIED="1488561167561" TEXT="Active Incidents (filtered by Subscription)"/>
</node>
<node CREATED="1488558617519" ID="ID_249082412" MODIFIED="1488558688179" TEXT="Pending Messages">
<node CREATED="1488558632233" ID="ID_629661090" MODIFIED="1488561180557" TEXT="Subscription messages (History?)"/>
<node CREATED="1488558640888" ID="ID_1370076960" MODIFIED="1488558644877" TEXT="User to User messages"/>
</node>
</node>
</node>
</node>
</node>
</map>