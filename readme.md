This is a sample project for prototyping changes to Grails scaffolding.

# To-Do

## Phase 1 - slightly slicker version of current Grails L&F

 * Flash messages & errors
 * Some _subtle_ use of text shadow and border radius
 * Form width
 * Show pages (left/right layout or dl style?)
 * .body { float: left; } is horrible

## Phase 2 - Re-design

 * FOUC prevention by fade-in with CSS transition
 * Center content & apply some background

### Navigation

 * All controllers in nav?
 * Primary & secondary nav for controllers / actions?

### Form inputs

 * Radio groups for enums (use select when more than x values?)
 * URL & email inputs when constraints present
 * Numerics using type="number", type="range"
 * JS enhance range with slider (where not natively supported)
 * Dates using type="date" with 3-field JS enhanced version?
 * Proper buttons
 * Is there a good alternative to multi-selects? (JS enhanced add & remove single selects?)
 * JS enhance single select as auto-completer

### Mobile

 * Test on iOS, Android, Blackberry

### Accessibility

 * WAI-ARIA roles

### Enhanced experience

 * Sort & paginate list with AJAX (remember to support back button)
 * Light-box show, edit, create direct from list page
 * Functional tests to ensure non-JS and JS versions work consistently