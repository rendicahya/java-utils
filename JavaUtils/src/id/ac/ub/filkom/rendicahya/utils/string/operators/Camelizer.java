package id.ac.ub.filkom.rendicahya.utils.string.operators;

import id.ac.ub.filkom.rendicahya.utils.string.interfaces.StringMapper;

// Input: "moz-transform"
// Output: "mozTransform"

// Input: "-moz-transform"
// Output: "MozTransform"

// Input: "_moz_transform"
// Output: "MozTransform"

// Input: "Moz-transform"
// Output: "MozTransform"
public class Camelizer implements StringMapper {
}
