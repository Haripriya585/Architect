package tw.architect;

import java.util.Objects;

public class Metrics {
    String metricType;
    double metricValue;

    public Metrics(String metricType, double metricValue) {
        this.metricType = metricType;
        this.metricValue = metricValue;
    }

    @Override
    public boolean equals(Object o) {
        Metrics metric = (Metrics) o;
        return Double.compare(metric.metricValue, metricValue) == 0 && Objects.equals(metricType, metric.metricType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricType, metricValue);
    }

    public void conversionOfMetricType(Metrics metric1,Metrics metric2){
        if(metric1.metricType == MetricTypes.METER.getMetricType() && metric2.metricType == MetricTypes.CENTIMETER.getMetricType()){
            metric2.metricValue = metric2.metricValue/100;
            metric2.metricType = MetricTypes.METER.getMetricType();
        }
    }
}