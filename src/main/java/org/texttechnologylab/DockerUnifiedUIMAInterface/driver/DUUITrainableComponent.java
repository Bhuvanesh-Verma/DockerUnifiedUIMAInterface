package org.texttechnologylab.DockerUnifiedUIMAInterface.driver;

public interface DUUITrainableComponent {
    /**
     * Called by the Composer after all documents have been processed.
     * Should trigger the training endpoint and return the path to the saved model.
     *
     * @param uuid UUID of the instantiated component
     * @return Path to the saved model, or null if not applicable
     */
    String finalizeTrain(String uuid) throws Exception;

    /**
     * Whether this component requires a finalizeTrain call.
     */
    boolean isTrainable(String uuid);
}