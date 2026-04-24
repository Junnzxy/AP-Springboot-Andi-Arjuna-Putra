const photographerQuote = "My eyes are colorblind, but my camera isn't";

const showQuoteBtn = document.getElementById('showQuoteBtn');
const hideQuoteBtn = document.getElementById('hideQuoteBtn');
const quoteDisplay = document.getElementById('quoteDisplay');

function showQuote() {
    quoteDisplay.textContent = photographerQuote;
    quoteDisplay.className = 'quote-text';
}

function hideQuote() {
    quoteDisplay.textContent = 'Click the button to see my quote';
    quoteDisplay.className = 'quote-placeholder';
}

if (showQuoteBtn) {
    showQuoteBtn.addEventListener('click', showQuote);
}
if (hideQuoteBtn) {
    hideQuoteBtn.addEventListener('click', hideQuote);
}

const toggleGearBtn = document.getElementById('toggleGearBtn');
const cameraGearList = document.getElementById('cameraGearList');

let gearVisible = true;

function toggleCameraGear() {
    if (gearVisible) {
        cameraGearList.style.display = 'none';
        toggleGearBtn.textContent = 'Show Camera Gear';
        gearVisible = false;
    } else {
        cameraGearList.style.display = 'block';
        toggleGearBtn.textContent = 'Hide Camera Gear';
        gearVisible = true;
    }
}

if (toggleGearBtn) {
    toggleGearBtn.addEventListener('click', toggleCameraGear);
}