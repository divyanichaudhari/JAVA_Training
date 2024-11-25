public class FitnessUtil {

    public String validateFitnessActivity(String activityData, int userWeightInKg) throws InvalidFitnessActivityException {
        String[] fitnessDetails = activityData.split(":");

        if (fitnessDetails.length != 3) {
            throw new InvalidFitnessActivityException("Error: Invalid activity data format. Must contain 3 details.");
        }

        String activityName = fitnessDetails[0].trim();
        String durationStr = fitnessDetails[1].trim();
        String intensityStr = fitnessDetails[2].trim();

        if (activityName.isEmpty() || 
            !(activityName.equalsIgnoreCase("Cycling") || 
              activityName.equalsIgnoreCase("Running") || 
              activityName.equalsIgnoreCase("Walking"))) {
            throw new InvalidFitnessActivityException("Error: Invalid Activity name.");
        }

        int duration;
        int intensity;
        try {
            duration = Integer.parseInt(durationStr);
            intensity = Integer.parseInt(intensityStr);
        } catch (NumberFormatException e) {
            throw new InvalidFitnessActivityException("Error: Duration and intensity must be valid integers.");
        }

        if (duration < 0 || intensity < 1 || intensity > 9) {
            throw new InvalidFitnessActivityException("Error: Invalid duration or intensity. Duration must be >= 0, Intensity must be between 1 and 9 inclusive.");
        }

        if (userWeightInKg <= 0) {
            throw new InvalidFitnessActivityException("Error: User weight is invalid.");
        }

        return "Validation Successful";
    }

    public int calculateCalories(String activityData, int userWeightInKg) throws InvalidFitnessActivityException {
        String[] fitnessDetails = activityData.split(":");

        validateFitnessActivity(activityData, userWeightInKg);
        
        String activityName = fitnessDetails[0].trim();
        int duration = Integer.parseInt(fitnessDetails[1].trim());
        int intensity = Integer.parseInt(fitnessDetails[2].trim());

        int caloriesPerMinute = 0;

        switch (activityName.toLowerCase()) {
            case "cycling":
                caloriesPerMinute = 5;
                break;
            case "running":
                caloriesPerMinute = 7;
                break;
            case "walking":
                caloriesPerMinute = 3;
                break;
            default:
                throw new InvalidFitnessActivityException("Error: Unknown activity for calorie calculation.");
        }

        int totalCaloriesBurned = (caloriesPerMinute * duration * intensity) / userWeightInKg;

        return totalCaloriesBurned;
    }
}
