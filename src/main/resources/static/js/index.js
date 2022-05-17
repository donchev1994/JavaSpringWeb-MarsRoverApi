let marsApiButtons = document.querySelectorAll("button[id*='marsApi']")

marsApiButtons.forEach(button => button.addEventListener('click', function () {
    const buttonId = this.id
    const roverId = buttonId.split('marsApi')[1]
    const apiData = document.getElementById('marsApiRoverData')
    apiData.value = roverId
    document.getElementById('frmRoverType').submit()
}))

function getUrlParameter(name) {
    name = name.replace(/[\[]/, '\\[').replace(/[\]]/, '\\]');
    let regex = new RegExp('[\\?&]' + name + '=([^&#]*)');
    let results = regex.exec(location.search);
    return results === null ? '' : decodeURIComponent(results[1].replace(/\+/g, ''));
}

let marsRoverType = getUrlParameter("marsApiRoverData")

highlightBtnByRoverType(marsRoverType)

let marsSol = getUrlParameter('marsSol')
document.getElementById('marsSol').value=marsSol


function highlightBtnByRoverType(roverType) {
    if (roverType === '')
        roverType = 'Opportunity'

    document.getElementById('marsApi' + roverType).classList.remove('btn-secondary')
    document.getElementById('marsApi' + roverType).classList.add('btn-primary')
}

// if (marsRoverType === 'Curiosity'){
//     document.getElementById('marsApiCuriosity').classList.remove('btn-secondary')
//     document.getElementById('marsApiCuriosity').classList.add('btn-primary')
// } else if (marsRoverType === 'Opportunity'){
//     document.getElementById('marsApiOpportunity').classList.remove('btn-secondary')
//     document.getElementById('marsApiOpportunity').classList.add('btn-primary')
// } else if (marsRoverType === 'Spirit'){
//     document.getElementById('marsApiSpirit').classList.remove('btn-secondary')
//     document.getElementById('marsApiSpirit').classList.add('btn-primary')
// }else {
//     document.getElementById('marsApiCuriosity').classList.remove('btn-secondary')
//     document.getElementById('marsApiCuriosity').classList.add('btn-primary')
// }



