package org.project.openbaton.nubomedia.api.openshift.json;

/**
 * Created by Carlo on 25/09/2015.
 */
public class BuildConfig {

    private final String kind = "BuildConfig";
    private final String apiVersion = "V1";
    private Metadata metadata;
    private Spec spec;

     public static class Spec{
         Trigger[] triggers; //TODO: add other triggers in class definition
         Source type;
         BuildStrategy bs;
         Output to;

         public Spec(Trigger[] triggers, Source type, BuildStrategy bs, Output output) {
             this.triggers = triggers;
             this.type = type;
             this.bs = bs;
             this.to = output;
         }

         public Spec() {
         }

         public Trigger[] getTriggers() {
             return triggers;
         }

         public void setTriggers(Trigger[] triggers) {
             this.triggers = triggers;
         }

         public Source getType() {
             return type;
         }

         public void setType(Source type) {
             this.type = type;
         }

         public BuildStrategy getBs() {
             return bs;
         }

         public void setBs(BuildStrategy bs) {
             this.bs = bs;
         }

         public Output getOutput() {
             return to;
         }

         public void setOutput(Output output) {
             this.to = output;
         }
     }

    public static class Output{

        BuildElements ouputElement;

        public Output(BuildElements ouputElement) {
            this.ouputElement = ouputElement;
        }

        public Output() {
        }

        public BuildElements getOuputElement() {
            return ouputElement;
        }

        public void setOuputElement(BuildElements ouputElement) {
            this.ouputElement = ouputElement;
        }
    }

    public BuildConfig() {
    }

    public BuildConfig(Metadata metadata, Spec spec) {
        this.metadata = metadata;
        this.spec = spec;
    }

    public String getKind() {
        return kind;
    }

    public String getApiV() {
        return apiVersion;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Spec getSpec() {
        return spec;
    }

    public void setSpec(Spec spec) {
        this.spec = spec;
    }
}
