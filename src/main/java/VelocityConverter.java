import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.apache.commons.io.FileUtils;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import ru.gov.pfr.ecp.fo.printedform.lib.util.DateConverter;
import ru.gov.pfr.ecp.fo.printedform.lib.util.NumbersTool;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class VelocityConverter {
    public static void main(String[] args) throws IOException {
        VelocityContext context = new VelocityContext();

        File file = new File("src/main/resources/in/data.xml");
        XStream xStream = new XStream(new DomDriver());
        xStream.allowTypesByWildcard(new String[]{"*"});

        // Написать корневой элемент вместо mass
        //xStream.alias("payreg", Map.class);
        //xStream.registerConverter(new MapEntryConverter());
        //Map<String, Object> map = (Map<String, Object>) xStream.fromXML(file);

//        xStream.processAnnotations(DataDTO.class);
//
//        xStream.processAnnotations(Recipients.class);
//        xStream.processAnnotations(Payments.class);
//        xStream.processAnnotations(Retentions.class);
//
//        xStream.processAnnotations(Recipient.class);
//        xStream.processAnnotations(Payment.class);
//        xStream.processAnnotations(Retention.class);

        xStream.processAnnotations(MessageDTO.class);
        xStream.processAnnotations(Main.class);
        xStream.processAnnotations(Division.class);
        xStream.processAnnotations(Information.class);
        xStream.processAnnotations(RecipientDetails.class);
        xStream.processAnnotations(RecipientBankDetails.class);
        xStream.processAnnotations(Table.class);
        xStream.processAnnotations(Payments.class);
        xStream.processAnnotations(PaymentType.class);
        xStream.processAnnotations(DeductionsByTypePayment.class);
        xStream.processAnnotations(PersonInfo.class);
        xStream.processAnnotations(Amounts.class);
        xStream.processAnnotations(PurposePayment.class);
        xStream.processAnnotations(Recoverer.class);

//        DataDTO data = (DataDTO) xStream.fromXML(file);

        MessageDTO message = (MessageDTO) xStream.fromXML(file);

//        context.put("data", data);
        context.put("message", message);
        context.put("numbersTool", new NumbersTool());
        context.put("dateConverter", new DateConverter());

        StringWriter stringWriter = new StringWriter();
        Reader reader = new FileReader("src/main/resources/in/newNew.xml", StandardCharsets.UTF_8);
        Velocity.evaluate(context, stringWriter, "VelocityService", reader);

        byte[] bytes = stringWriter.toString().getBytes(StandardCharsets.UTF_8);
        String result = Arrays.toString(bytes);

        FileUtils.writeByteArrayToFile(new File("src/main/resources/out/newNew.xml"), bytes);

        System.out.println("Success");
    }
}